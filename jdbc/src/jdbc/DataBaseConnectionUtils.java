package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionUtils {
	//This method create the Connection Return the Connection 
	public static Connection createconnection() {
	Connection connection = null; 
			try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");	
			}
			catch(ClassNotFoundException | SQLException e)
			{	e.printStackTrace();			
			}
			return connection;
		}

	
	}



	






