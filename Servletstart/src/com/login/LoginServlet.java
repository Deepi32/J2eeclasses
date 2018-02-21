package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		ServletContext sc=req.getServletContext();
		String contextname=(String) sc.getAttribute("username");
		String contextpassword=(String) sc.getAttribute("password");
		Cookie ck=new Cookie("cookiename",contextname);
		Cookie ck1=new Cookie("cookiepswd",contextpassword);
		resp.addCookie(ck);
		resp.addCookie(ck1);
		String name=req.getParameter("user");
		String pswd=req.getParameter("pswd");
		PrintWriter out=resp.getWriter();
		if(contextname.equals(name)&&contextpassword.equals(pswd)){
			out.println("Your Login is successful");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("/Signup.html");
			rd.include(req, resp);
			
		}
	
	}

}
