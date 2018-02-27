package com.basic;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class SelectQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee emp=(Employee)session.get(Employee.class,1);
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

}
