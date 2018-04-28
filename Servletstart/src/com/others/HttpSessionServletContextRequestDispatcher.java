package com.others;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HttpSessionServletContextRequestDispatcher  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("NAME");
		out.println("NAME using req.getParameter"+name);
		//HttpSession
		HttpSession session=req.getSession();
		session.setAttribute("httpname","Deepasnhu Goyal");
		
		//ServletContext
		ServletContext context=req.getServletContext();
		context.setAttribute("Servname","Himani");
		
		
		
	}

}
