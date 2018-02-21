package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookieimplement extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter pw=res.getWriter();
		String name="geet";
		
		Cookie ck=new Cookie("cookiename",name);
		res.addCookie(ck);
		System.out.println("cookie is saved....");
		pw.println("cookie name is    "+name);
		RequestDispatcher rd=req.getRequestDispatcher("/servlet2");
		rd.include(req, res);
		
		
		
	}
}
