package com.onetomany;

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
		Student st=new Student();
		st.setSid(101);
		st.setName("Nishant");
		st.setEmail("Nishant@gmail.com");
		
		Course c1=new Course();
		c1.setCouseid(5);
		c1.setCoursename("Hibernate");
		

		Course c2=new Course();
		c2.setCouseid(6);
		c2.setCoursename("SPRING");
		

		Course c3=new Course();
		c3.setCouseid(7);
		c3.setCoursename("STRUTS");
		
		Set courses=new HashSet();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		st.setCourses(courses);
		session.save(st);
		t.commit();
		System.out.println("adding done..........");
		
	}

}
