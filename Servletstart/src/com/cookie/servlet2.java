package com.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=resp.getWriter();
		try{
		Cookie cookie[]=req.getCookies();
		int i=0;
		while(!cookie[i].getName().equals("cookiename"))
		{
			i++;
		}
		
		String str=cookie[i].getValue();
		System.out.println("cookie string is "+str);
		pw.println("data from cookie is "+str);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}

}
