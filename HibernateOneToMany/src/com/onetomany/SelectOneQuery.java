package com.onetomany;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SelectOneQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Student st=(Student)session.get(Student.class,102);
		System.out.println("Student Record is :"+st.getSid()+"  "+st.getName()+"  "+st.getEmail());
		Set courses=st.getCourses();
		Iterator itr=courses.iterator();
		while(itr.hasNext())
		{
			Course c1=(Course)itr.next();
			System.out.println("Course details**********");
			System.out.println(c1.getCouseid()+" "+c1.getCoursename());
		}
		System.out.println("TRsaction done...........");

	}

}
