package com.basic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class FirstLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Employee e=(Employee)session.get(Employee.class, 204);
		Employee e1=(Employee)session.get(Employee.class, 204);
		Session session1=factory.getCurrentSession();
		Employee e2=(Employee)session1.get(Employee.class, 204);
		Employee e3=(Employee)session1.get(Employee.class, 204);
		

	}

}
