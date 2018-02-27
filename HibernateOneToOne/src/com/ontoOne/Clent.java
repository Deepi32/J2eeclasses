package com.ontoOne;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Clent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
	/*	Student st=new Student();
		st.setSid(102);
		st.setName("Shashank");
		st.setEmail("Shashank@gmail.com");
		
		Course c1=new Course();
		c1.setCouseid(5);
		c1.setCoursename("C");
		

		Course c2=new Course();
		c2.setCouseid(6);
		c2.setCoursename("CPP");
		
		st.setCourse(c1);
		st.setCourse(c2);
		session.save(st);*/
		
		Student st=new Student();
		st.setSid(201);
		st.setName("Asha");
		st.setEmail("Asha@gmail.com");
		
		Course c1=new Course();
		c1.setCouseid(7);
		c1.setCoursename("Hibernate");
		c1.setSt(st);
		session.save(c1);
		t.commit();
		System.out.println("adding done..........");
		
	}

}
