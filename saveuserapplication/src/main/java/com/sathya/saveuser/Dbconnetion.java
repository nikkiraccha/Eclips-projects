 package com.sathya.saveuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnetion {

		//this method create the connection and return the connection
		public static Connection createConnection()
		{
			Connection connection=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikki","welcome");
				
			} catch (ClassNotFoundException |SQLException e) {
				e.printStackTrace();
				
			}
			return connection;
				
		}

	}



