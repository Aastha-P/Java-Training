package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyService extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
		System.out.println("Do Get Method");
		
		res.setContentType("text/html");
		PrintWriter w=res.getWriter();
		
		String name=req.getParameter("uname");
		int age=Integer.parseInt(req.getParameter("age"));
		
		w.print("<html><body>");
		w.print("<h1><b>This is Servlet Page.</b></h1>");
		w.print("<h2><b>User name is: "+name+"</b></h2>");
		w.print("<h2><b>Age is: "+age+"</b></h2>");
		w.print("</body></html>");
	}
	
	public void destroy() {
		System.out.println("DoGet is destroyed.");
	}

}
