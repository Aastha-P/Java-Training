package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException{
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		
		if(uname.equals("sistec")&&pwd.equals("test")) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome");
			rd.forward(req,res);
		}
		else {
			out.println("Invalid Credential");
			RequestDispatcher rd=req.getRequestDispatcher("/UI.html");
			rd.include(req, res);
		}
	}

}
