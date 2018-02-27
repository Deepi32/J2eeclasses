package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Employee e=new Employee();
		e.setEmpid(201);
		e.setName("Deeps");
		e.setSalary(190000);
		session.save(e);
		t.commit();
		System.out.println("Inserted transaction");

	}

}
