package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Firstservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		
		PrintWriter writer=response.getWriter();
		writer.println("this is first servlet");
		writer.println("adv java class by ratan sir");
		writer.println("servlet application very good");
		writer.println("nice ....");
	}

	
	

}
