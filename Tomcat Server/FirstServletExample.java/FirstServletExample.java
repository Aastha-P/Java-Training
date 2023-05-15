package com.servin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServletExample implements Servlet {
	ServletConfig config=null;
	
	@Override
	public void init(ServletConfig req) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet is initialized.");
}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
	    out.print("<b>Servlet by implementing Servlet Interface.</b>");
	    out.print("</body></html>");
	    out.print("<a href=\"index1.html\">Home Page</a>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet is destroyed.");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "my servlet 9.0";
	}

	
	
	

}

