package com.sathya.saveuser;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDao {
		
		public int  saveUser(User user)
		{   
			int result=0;
			
			try(Connection connection = Dbconnetion.createConnection())
			{
				PreparedStatement PreparedStatement=connection.prepareStatement("insert into user_table values(?,?,?,?,?)");
				PreparedStatement.setString(1, user.getUserId());	
				PreparedStatement.setString(2, user.getUserName());	
				PreparedStatement.setString(3, user.getUserEmail());	
				PreparedStatement.setString(4, user.getUserMobile());	
				PreparedStatement.setString(5, user.getUserLocation());
				result=PreparedStatement.executeUpdate();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
			
		}
		public User findById(String userId)
		{
			User user = null; 
			try(Connection connection = Dbconnetion.createConnection())
			{
				PreparedStatement preparedStatement = connection.prepareStatement("select * from user_table where userId=?");
				preparedStatement.setString(1, userId);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next())
				{	user = new User();
					user.setUserId(resultSet.getString(1));
					user.setUserName(resultSet.getString(2));
					user.setUserEmail(resultSet.getString(3));
					user.setUserMobile(resultSet.getString(4));
					user.setUserLocation(resultSet.getString(5));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return user;
		}
		
		public int logincheck(String userName,String userEmail)
		{
			int result=0;
			User user=null;
			
			try(Connection connection=Dbconnetion.createConnection())
			{
				PreparedStatement preparedStatement=connection.prepareStatement("select * from user_table where userName=?&&userEmail=? ");
				preparedStatement.setString(1, userName);
				preparedStatement.setString(1, userEmail);
				
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next())
				{	user = new User();
					user.setUserName(resultSet.getString(1));
					user.setUserEmail(resultSet.getString(2));
					
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
			
		}

	

   public List<User> findAll()
   {  List<User> user=new ArrayList<User>();
      User u=null;
	 try(Connection connection=Dbconnetion.createConnection())
	 {
		Statement statement= connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("select * from user_table");
		while(resultSet.next())
		{    u=new User();
			u.setUserId(resultSet.getString(1));
			u.setUserName(resultSet.getString(2));
			u.setUserEmail(resultSet.getString(3));
			u.setUserMobile(resultSet.getString(4));
			u.setUserLocation(resultSet.getString(5));
			user.add(u);
		}
	 }
	 catch(SQLException e)
	 {
		 e.printStackTrace();
	 }
	 return user;
   }

  
   public User deleteById(String userId) {
		User user = null; 
      try(Connection connection=Dbconnetion.createConnection()){
   	
			PreparedStatement preparedStatement = connection.prepareStatement("delete from user_table where userId=?");
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{	user = new User();
				user.setUserId(resultSet.getString(1));
				user.setUserName(resultSet.getString(2));
				user.setUserEmail(resultSet.getString(3));
				user.setUserMobile(resultSet.getString(4));
				user.setUserLocation(resultSet.getString(5));
			}   
      } catch (SQLException e) {
		e.printStackTrace();
	}
				return user;
	}
}