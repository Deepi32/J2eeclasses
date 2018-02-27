package com.manyTomany;

import java.util.HashSet;
import java.util.Set;

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
		Student st=new Student();
		st.setSid(677);
		st.setName("Deepa");
		st.setEmail("Deepa@gmail.com");
		
		Student st1=new Student();
		st1.setSid(679);
		st1.setName("nashi");
		st1.setEmail("Archi@gmail.com");
		
		Course c1=new Course();
		c1.setCouseid(1000);
		c1.setCoursename("C");
		
		Set students=new HashSet();
		students.add(st);
		students.add(st1);
		
		c1.setStudent(students);
		session.save(c1);
		t.commit();
		
		
		
	}

}
