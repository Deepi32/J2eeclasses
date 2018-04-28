package com.others;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Secondclass extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out=resp.getWriter();
		//HTTPSESSION interface
		HttpSession session=req.getSession();
		String str1=(String) session.getAttribute("httpname");
		out.println("String is :"+str1);
		
		ServletContext context=req.getServletContext();
		String str2=(String)context.getAttribute("Servname");
		out.println(str2);
		
		
	}
}
