package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteQuery {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee emp=(Employee)session.get(Employee.class,1);
		session.delete(emp);
		t.commit();
		System.out.println("operation delete is done:::::::");
		
		
	}

}
