package com.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		STudent st=new STudent();
		st.setSid(501);
		st.setName("Nisha");
		st.setEmail("Nisha@gmail.com");
		
		Course c1=new Course();
		c1.setCouseid(101);
		c1.setCoursename("Hibernate");
		c1.setSt(st);
		
		Course c2=new Course();
		c2.setCouseid(102);
		c2.setCoursename("DS");
		c2.setSt(st);
		
		Course c3=new Course();
		c3.setCouseid(103);
		c3.setCoursename("DSA");
		c3.setSt(st);
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		t.commit();
		
		
	}

}
