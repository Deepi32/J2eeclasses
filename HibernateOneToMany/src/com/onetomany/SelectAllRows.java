package com.onetomany;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class SelectAllRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
	/*	String qr="from Student";
		Query query=session.createQuery(qr);
		List l=query.list();
		
		*/
		Criteria cr=session.createCriteria(Student.class);
		List l=cr.list();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println("Student Record is :"+st.getSid()+"  "+st.getName()+"  "+st.getEmail());
			Set courses=st.getCourses();
			Iterator itr1=courses.iterator();
			while(itr1.hasNext())
			{
				Course c1=(Course)itr1.next();
				System.out.println("Course details**********");
				System.out.println(c1.getCouseid()+" "+c1.getCoursename());
			}
			
		}

	}

}
