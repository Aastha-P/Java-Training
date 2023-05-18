package com.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletInterface extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<html><body>");
		out.print("<b>Servlet by implementing Servlet Interface.</b>");
		out.print("</body></html>");
		
	}

}
