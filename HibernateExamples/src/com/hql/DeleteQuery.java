package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteQuery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		String str1="Delete from Employee e where e.empid=3";
		Query query=session.createQuery(str1);
	//	query.setParameter("eid",3);
		int count=query.executeUpdate();
		
		t.commit();
		System.out.println("delete number of query is"+count);
	}


}
