package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		SEmployee se=new SEmployee();
		se.setEmpid(101);
		se.setName("Krishna");
		se.setSalary(190000);
		HEmployee he=new HEmployee();
		he.setEmpid(102);
		he.setName("Chandru");
		he.setSalperHour(4);
		he.setWorkhours(6);
		session.save(se);
		session.save(he);
		t.commit();
		System.out.println("Transaction done.............");
		
	}

}
