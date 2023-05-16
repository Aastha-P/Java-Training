package com.genserv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServletExample extends GenericServlet {

	private static final long serialVersionUID=1L;
	ServletConfig config=null;
	public void init(ServletConfig config) {
		this.config=config;
		System.out.print("servlet is initialized.");
	}
	
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException {
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><head><title>Generic Servlet</title></head><body>");
		out.print("<b>Servlet by extending Generic Servlet class</b>");
		out.print("</body></html>");
	}
	
	public void destroy() {
		System.out.print("Servlet is destroyed");
	}
	
	public ServletConfig getServletConfig() {
		return config;
	}
	
	public String getServletInfo() {
		return "My Servlet 9.0";
	}

}
