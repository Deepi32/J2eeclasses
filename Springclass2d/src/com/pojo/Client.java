package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Database db=(Database)ac.getBean("db1");
		System.out.println("Output is :::::::"+db.getConnection()+"  "+db.getUsername()+"  "+db.getPassword());
		
		

	}

}
