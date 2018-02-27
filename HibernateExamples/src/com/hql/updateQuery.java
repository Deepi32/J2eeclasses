package com.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateQuery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t= session.beginTransaction();
		String str1="update Employee e set e.salary=190000 where e.empid=2";
		Query query=session.createQuery(str1);
		int count=query.executeUpdate();
		t.commit();
		
		
		System.out.println("count for update count is"+count);
	
		
	}

}
