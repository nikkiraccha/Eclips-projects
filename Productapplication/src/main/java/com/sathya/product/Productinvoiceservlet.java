package com.sathya.product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Productinvoiceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get request from client
		
		int proid=Integer.parseInt(request.getParameter("proid"));
		String proname=request.getParameter("proname");
		double proprice=Double.parseDouble(request.getParameter("proprice"));
		int proquantity=Integer.parseInt(request.getParameter("proquantity"));
		
		//process the data
		
		double totalbill;
		double discount=0.0;
		totalbill=proprice*proquantity;
		String discountmsg="no discount";
		
		if(totalbill>1000 && totalbill<5000)
		{discount= totalbill*0.05;
			discountmsg="5% discount";
		}
		else if(totalbill>5000 && totalbill<10000)
		{discount= totalbill*0.1;
			discountmsg="10% discount";
		}
		else if (totalbill>10000)
		{discount=totalbill*0.15;
			discountmsg="15% discount";
		}
		else
		{
			System.out.println("no discount");
		}
		
		
		double netbill;
		netbill=totalbill-discount;
		
		//response to browser
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		
		writer.println("<html><body bgcolor='aqua'>");
		writer.println("<h1>***product invoice**</h1>");
		writer.println("<p>product id .."+proid+"</p>");
		writer.println("<p>product name .."+proname+"</p>");
  		writer.println("<p>product price .."+proprice+"</p>");
		writer.println("<p>total price of.."+proquantity+"products: $"+totalbill+"</p>");
		writer.println(discountmsg+"amount.."+discount);
		writer.println("<p> net amount to pay.."+netbill+"</p>");
		writer.println("</body></html>");
		
	}

	

}
