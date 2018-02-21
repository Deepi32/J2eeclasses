package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie ck=new Cookie("cookiename","");
		Cookie ck1=new Cookie("cookiepswd","");
		ck.setMaxAge(0);
		ck1.setMaxAge(1000);
		resp.addCookie(ck);
		resp.addCookie(ck1);
		PrintWriter out=resp.getWriter();	
		//String str=resp
		out.println("cookie is deleted");
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.include(req, resp);
	}

}
