package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Average extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		
		int num1=Integer.parseInt(req.getParameter("no1"));
		int num2=Integer.parseInt(req.getParameter("no2"));
		int num3=Integer.parseInt(req.getParameter("no3"));
		
		double avg=(num1+num2+num3)/3;
		
		o.print("<html><body>");
		o.print("<h1><b>Average of given number= "+avg+"</b></h1>");
		o.print("</body></html>");
	}

}

