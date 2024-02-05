package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProductDao {
	public int createProducttable() {
		
		Connection connection = null; 
		Statement statement = null; 
		int result = 0; 
		
		try {
		connection = DataBaseConnectionUtils.createconnection();	
		statement = connection.createStatement();
		String query = "create table product_info(proId varchar2(20) primary key,proName varchar2(20),proPrice number)";
		result = statement.executeUpdate(query);
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		finally 
		{
			try {  if (connection!=null) connection.close();
			       if (statement!=null) statement.close();
				
			    }
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int saveProduct(Product p)
	
	{
		int result = 0;
		try(Connection connection = DataBaseConnectionUtils.createconnection())
		{
			//create the ps object with params 
			  PreparedStatement preparedStatement =
					  connection.prepareStatement("insert into product_info values(?,?,?)");
			  
			  //set the data to params
			   preparedStatement.setString(1, p.getProId());
			   preparedStatement.setString(2, p.getProName());
			   preparedStatement.setDouble(3, p.getProPrice());
			   
			   //execute the query
			   result = preparedStatement.executeUpdate();

			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public Product findById(String proId) {
		Product p=null;
		try(Connection connection=DataBaseConnectionUtils.createconnection())
		
		{	
			//create the ps object
			PreparedStatement preparedStatement=connection.prepareStatement("select * from product_info where proId=?");
			
			//set the data to params
			preparedStatement.setString(1, proId);
			//execute the query
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next())
			{
				p=new Product();
				p.setProId(resultSet.getString(1));
				p.setProName(resultSet.getString(2));
				p.setProPrice(resultSet.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
		
	}
	
public int updateProduct(double  price,double incr)
{
	int result=0;
    try(Connection connection=DataBaseConnectionUtils.createconnection()) 
	{
    	//create the ps object
    	PreparedStatement preparedStatement=connection.prepareStatement("update product_info set proPrice=proPrice+? where proPrice>?");
    	
    	//set data to params
    	preparedStatement.setDouble(1, incr);
    	preparedStatement.setDouble(2, price);
    	
    	//execute the query
    	 result=preparedStatement.executeUpdate();		
	}
    catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
}
public int deleteById(String proId)
{
	int result=0;
    try(Connection connection=DataBaseConnectionUtils.createconnection()) 
	{
    	//create the ps object
    	PreparedStatement preparedStatement=connection.prepareStatement("delete from product_info where proId=?");
    	
    	//set data to params
    	preparedStatement.setString(1, proId);
    	
    	
    	//execute the query
    	 result=preparedStatement.executeUpdate();		
	}
    catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
}

public int deleteByPrice(double proPrice)
{
	int result=0;
    try(Connection connection=DataBaseConnectionUtils.createconnection()) 
	{
    	//create the ps object
    	PreparedStatement preparedStatement=connection.prepareStatement("delete from product_info where proPrice=?");
    	
    	//set data to params
    	preparedStatement.setDouble(1, proPrice);
    	
    	
    	//execute the query
    	 result=preparedStatement.executeUpdate();		
	}
    catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
}
public int dropProduct()
{
	int result=0;
    try(Connection connection=DataBaseConnectionUtils.createconnection()) 
	{
    	//create the  statement object
    	Statement statement=connection.createStatement();
    	
    	//execute the query
    	 result=statement.executeUpdate("drop table product_info");		
	}
    catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
}

public int updateProductid(String proId, String change)
{
	int result=0;
    try(Connection connection=DataBaseConnectionUtils.createconnection()) 
	{
    	//create the ps object
    	PreparedStatement preparedStatement=connection.prepareStatement("update product_info set proId=? where proId=? ");
    	
    	//set data to params
    	preparedStatement.setString(1, change);
    	preparedStatement.setString(2, proId);
    	
    	
    	//execute the query
    	 result=preparedStatement.executeUpdate();		
	}
    catch (SQLException e) {
		e.printStackTrace();
	}
    return result;
}
public List<Product> findAll() {
	List<Product> products=new ArrayList<Product>();
	Product p=null;
	try(Connection connection=DataBaseConnectionUtils.createconnection())
	
	{	
		//create the statement object
		Statement statement=connection.createStatement();
		
		//execute the query
		ResultSet resultSet=statement.executeQuery("select * from product_info");
		while(resultSet.next())
		{//read the data from result set and set to product
			p=new Product();
			p.setProId(resultSet.getString(1));
			p.setProName(resultSet.getString(2));
			p.setProPrice(resultSet.getDouble(3));
			
			//adding product to list
			products.add(p);
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return products;
	
}
	
}





