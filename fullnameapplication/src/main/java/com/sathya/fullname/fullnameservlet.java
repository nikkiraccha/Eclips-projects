package com.sathya.fullname;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class fullnameservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data from client
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	
	//process the data
	String fullname;
	fullname=firstname+lastname;
	
	//give response to browser
	response.setContentType("text/plain");
	PrintWriter writer=response.getWriter();
	writer.println("your full name..."+fullname);
	
	
		 
	}

	

}
