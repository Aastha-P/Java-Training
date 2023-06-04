package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter o=res.getWriter();
		o.print("<html><body>");
		String name=req.getParameter("username");
		o.print("<h1>Hello,"+name+"Welcome to sistec....</h1>");
		
		Cookie ck=new Cookie("uname",name);
		res.addCookie(ck);
		
		o.print("<h1><a href='pick'>GO to Servlet2</a></h1>");
		o.print("</body></html>");
	}

}
