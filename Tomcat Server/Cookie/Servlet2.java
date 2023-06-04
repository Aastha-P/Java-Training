package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
        out.print("<html><body>");
		
		
		Cookie ck[]=req.getCookies();
		boolean f=false;
		String name="";
		if(ck==null)
		{
			out.print("<h1>You are new usergo to home page and submit your new registration");
			return;
		}
		else
		{
			for(int i=0;i<ck.length;i++)
			{
				String tname=ck[i].getName();
				if(tname.equals("uname"))
				{
					f=true;
					name=ck[i].getValue();
					
				}
			}
		
		}
		if(f=true)
		{
	       out.print("<h1>Hello, "+name+"Welcome back to sistec..</h1>");
	       out.print("<h1>Thank you</h1>");
	       out.print("<h1><a href='UI.html'>Go back to Home Page</a></h1>");
	       
		}
		else {
			out.print("<h1>You are new usergo to home page and submit your new registration");
            out.print("</body></html>");
		}
		
	
	}

}
