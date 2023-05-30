package com.search;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
      
		String s= req.getParameter("search");
        String targeturl ="https://www.google.com/search?q="+s;
		res.sendRedirect(targeturl);	
	}
}
