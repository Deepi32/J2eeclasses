package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientApp {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmpid(105);
		emp.setName("Rudraksh"
				+ "");
		emp.setSalary(159000);
		session.save(emp);
		t.commit();
		System.out.println("i m done");
		
	}
}
