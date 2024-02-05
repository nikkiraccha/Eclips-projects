package cvom.sathya.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the data from request
		
		 String username=request.getParameter("username");
		  String password=request.getParameter("password");
		  
		  //process the data
		  
		  if(username.equalsIgnoreCase("nikki") && password.equals("nikki@123"))
		  {
			  response.sendRedirect("http://bts.ibighit.com");
		  }
		  else
		  {
			  response.sendError(909, "login fail enter valid data");
		  }
		
	}

}
