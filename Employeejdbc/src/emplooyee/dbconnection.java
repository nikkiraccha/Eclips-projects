package emplooyee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	//This method create the Connection Return the Connnenction 
		public static Connection createConnection()
		{	Connection connection = null; 	
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




