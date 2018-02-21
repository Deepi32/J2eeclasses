package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signupservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		ServletContext context=req.getServletContext();
		String name=req.getParameter("user");
		String pswd=req.getParameter("pswd");
		String rollno=req.getParameter("rollno");
		context.setAttribute("username",name);
		context.setAttribute("password",pswd);
		context.setAttribute("rollnumber",rollno);
		PrintWriter pw=resp.getWriter();
		System.out.println("response is registered");
		pw.println("Your signup process is done.......");
		RequestDispatcher rd=req.getRequestDispatcher("/Login.html");
		rd.include(req, resp);
		
		
		
	}

}
