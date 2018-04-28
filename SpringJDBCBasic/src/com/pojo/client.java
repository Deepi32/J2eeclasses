package com.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class client {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao emp=(EmployeeDao)context.getBean("edao");
		int status=emp.saveEmployee(new Employee(101,"AMMI",3600));
		System.out.println("STATUS IS ::::"+status);
	}

}
