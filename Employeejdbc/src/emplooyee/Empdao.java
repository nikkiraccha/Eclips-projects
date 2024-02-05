package emplooyee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Empdao {
	public int createProducttable()
	{	Connection connection = null; 
		Statement statement = null; 
		int result = 0; 
		try {
		connection = dbconnection.createConnection();	
		statement = connection.createStatement();
		result = statement.executeUpdate("create table employee_info(empId varchar2(30) primary key,empName varchar2(20),empsal number)");
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		finally
		{	try {
				if(connection!=null) connection.close();			
				if(statement!=null) statement.close();
			}
			catch(SQLException e)
			{	e.printStackTrace();
			}
		}
		return result;
	}
	

	public int saveProduct(Employee p)
	{	int result = 0; 
		try(Connection connection = dbconnection.createConnection())
		{	//create the PS object with params
			PreparedStatement preparedStatement = connection.prepareStatement("insert into employee_info values(?,?,?)");
			
			//set the data to params 
			preparedStatement.setString(1, p.getEmpId());
			preparedStatement.setString(2, p.getEmpName());
			preparedStatement.setDouble(3, p.getEmpSal());
			
			// Execuet the query 
			result = preparedStatement.executeUpdate();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public Employee findbyId(String EmpId )
	{	Employee p = null;
		try(Connection connection = dbconnection.createConnection())
		{	//create the PS object 
			PreparedStatement preparedStatement = connection.prepareStatement("select * from Employee_info where EmpId=?");
			//set the data to params 
			preparedStatement.setString(1, EmpId);
			//execute the query. 
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next())
			{	//read the data from ResultSer & setting to product
				p = new Employee();
				p.setEmpId(resultSet.getString(1));
				p.setEmpName(resultSet.getString(2));
				p.setEmpSal(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return p;
	}
	
	public List<Employee> findAll()
	{	List<Employee> employee = new ArrayList<Employee>();
		Employee e = null;
		try(Connection connection = dbconnection.createConnection())
		{
			Statement statement = connection.createStatement();
			ResultSet resultSet =  statement.executeQuery("select * from employee_info");
			
			while(resultSet.next())
			{	//read the data from ResultSer & setting to product
				e = new Employee();
				e.setEmpId(resultSet.getString(1));
				e.setEmpName(resultSet.getString(2));
				e.setEmpSal(resultSet.getDouble(3));
				
				//adding the product into List.
				employee.add(e);
			}
		}
		catch (SQLException s) {
			s.printStackTrace();
		}
		return employee;
	}

	public int updateEmployee(double salary,double incValue)
	{	int result = 0;
		try(Connection connection = dbconnection.createConnection())
		{	//create the PS object
			PreparedStatement preparedStatement = connection.prepareStatement("update employee_info set empSal=empSal+? where empSal>?");
			//set the data to params 
			preparedStatement.setDouble(1, incValue);
			preparedStatement.setDouble(2, salary);
			//execute the query 
			result =  preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}

	public int deleteEmpById(String empId)
	{	int result = 0;
	try(Connection connection = dbconnection.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement("delete from employee_info  where empId=?");
		//set the data to params 
		preparedStatement.setString(1,empId );
		
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
}
	
	public int deleteEmpByPrice(double empSal)
	{	int result = 0;
	try(Connection connection = dbconnection.createConnection())
	{	//create the PS object
		PreparedStatement preparedStatement = connection.prepareStatement
				("delete from employee_info where empSal>=?");
		//set the data to params 
		preparedStatement.setDouble(1,empSal);
		//execute the query 
		result =  preparedStatement.executeUpdate();
	}
	catch(SQLException e)
	{	e.printStackTrace();
	}
	return result;
	}
	
	public int droptable()
	{	int result=0;
		try(Connection connection=dbconnection.createConnection())
		{
			//create the statement object
			Statement statement = connection.createStatement();
			//execute the query
			result = statement.executeUpdate("drop table employee_info");
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}
}



