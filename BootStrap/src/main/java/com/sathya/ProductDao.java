package com.sathya;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProductDao {
	public int  saveProduct(Product product)
	{   
		int result=0;
		
		try(Connection connection = Dbconnection.createConnection())
		{
			PreparedStatement PreparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
			PreparedStatement.setString(1, product.getProId());	
			PreparedStatement.setString(2, 	product.getProName());
			PreparedStatement.setDouble(3, product.getProPrice());	
			PreparedStatement.setString(4, product.getProBrand());
			PreparedStatement.setString(5, product.getMadeIn());
			PreparedStatement.setDate(6, (Date) product.getProMfgDate());
			PreparedStatement.setDate(7, (Date) product.getProExpDate());
		    PreparedStatement.setBinaryStream(8, product.getImage());
			result=PreparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public List<Product> findAll() {
        List<Product> productList = new ArrayList<Product>();
        //try-with resources :: Resources released automatically
        try(Connection connection = Dbconnection.createConnection();
        	Statement statement = connection.createStatement();) 
        {	
        	//Read the data from resultSet store into ResultSet 
            ResultSet resultSet = statement.executeQuery("select * from product_data");
            
            //Read the data from ResultSet set to Product object & store into List  
            //The loop repeated how many records present in table. 
            while (resultSet.next()) {
	         	  Product product = new Product();
	         	  product.setProId(resultSet.getString("proId"));
				  product.setProName(resultSet.getString("proName"));
				  product.setProPrice(Double.parseDouble(resultSet.getString("proPrice")));
				  product.setProBrand(resultSet.getString("proBrand"));
				  product.setMadeIn(resultSet.getString("madeIn"));
				  product.setProMfgDate(resultSet.getDate("proMfgdate"));
				  product.setProExpDate(resultSet.getDate("proExpDate"));
				  product.setImage(resultSet.getBinaryStream("image"));
				  product.setReadImage(resultSet.getBytes("image"));
				  productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

	public int deleteById(String proId) {
		int result=0;
      try(Connection connection=Dbconnection.createConnection()){
   	
			PreparedStatement preparedStatement = connection.prepareStatement("delete from product_data where proId=?");
			preparedStatement.setString(1, proId);
			result = preparedStatement.executeUpdate();
			 
      } catch (SQLException e) {
		e.printStackTrace();
	}
				return result;
	}
	
	public Product  findbyId(String proId) {
        Product product=null;
        try(Connection connection = Dbconnection.createConnection())
        {
        	PreparedStatement preparedStatement=connection.prepareStatement("select * from product_data where proId=?");
        	preparedStatement.setString(1, proId);
        	//Read the data from resultSet store into ResultSet 
        	
            ResultSet resultSet = preparedStatement.executeQuery();
            
            
            if(resultSet.next()) {
	         	   product = new Product();
	         	  product.setProId(resultSet.getString("proId"));
				  product.setProName(resultSet.getString("proName"));
				  product.setProPrice(Double.parseDouble(resultSet.getString("proPrice")));
				  product.setProBrand(resultSet.getString("proBrand"));
				  product.setMadeIn(resultSet.getString("madeIn"));
				  product.setProMfgDate(resultSet.getDate("proMfgdate"));
				  product.setProExpDate(resultSet.getDate("proExpDate"));
				  product.setImage(resultSet.getBinaryStream("image"));
				  product.setReadImage(resultSet.getBytes("image"));
				  
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
	
	
	public int updateProduct(Product updatedProduct) {
	    int result = 0;
    try(Connection connection = Dbconnection.createConnection())
    {
    	int parameterIndex = 1;
         // SQL query to update product details
    	 String sql = "UPDATE product_data SET proName=?, proPrice=?, proBrand=?, madeIn=?, " +
                 "proMfgDate=?, proExpDate=?" +
                 (updatedProduct.getImage() != null ? ", image=?" : "") +
                 " WHERE proId=?";
        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Set the parameters for the update statement
        preparedStatement.setString(parameterIndex++, updatedProduct.getProName());
        preparedStatement.setDouble(parameterIndex++, updatedProduct.getProPrice());
        preparedStatement.setString(parameterIndex++, updatedProduct.getProBrand());
        preparedStatement.setString(parameterIndex++, updatedProduct.getMadeIn());
        preparedStatement.setDate(parameterIndex++, (Date) updatedProduct.getProMfgDate());
        preparedStatement.setDate(parameterIndex++, (Date) updatedProduct.getProExpDate());
        
        if ( updatedProduct.getImage() != null) {
            preparedStatement.setBinaryStream(parameterIndex++, updatedProduct.getImage());
        }
        
        preparedStatement.setString(parameterIndex++, updatedProduct.getProId());

            // Execute the update
            result = preparedStatement.executeUpdate();
        }
     catch (SQLException e) {
        e.printStackTrace();
    } 
    return result;
	    }


}
