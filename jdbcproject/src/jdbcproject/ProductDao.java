package jdbcproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {
	
	public int createProducttable()
	{
		Connection connection = null; 
		Statement statement = null; 
		int result = 0; 
		
		try {
		connection = DataBaseConnectionUtils.createConnection();	
		statement = connection.createStatement();
		String query = "create table product_info(proId number primary key,proName varchar2(20),proPrice number)";
		result = statement.executeUpdate(query);
		}
		catch(SQLException e)
		{	e.printStackTrace();
		}
		return result;
	}
}
