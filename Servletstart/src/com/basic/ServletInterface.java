package com.basic;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterface implements Servlet {

	ServletConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("i m destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("i m getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("i m getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		config=arg0;
		System.out.println("i m init");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("i m service");
	}

}