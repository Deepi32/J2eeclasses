package com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DeleteSingleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
	/*	STudent st=(STudent)session.get(STudent.class,101);
		session.delete(st);
		t.commit();  */ 
		System.out.println("Session is completed.......................");
		Course c1=(Course)session.get(Course.class,103);
		session.delete(c1);
		t.commit();
	}
}
