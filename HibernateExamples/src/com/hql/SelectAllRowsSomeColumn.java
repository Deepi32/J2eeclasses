package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectAllRowsSomeColumn {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		String query="select e.empid,e.salary from Employee e";
		Query q=session.createQuery(query);
		List list=q.list();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj[]=(Object[]) itr.next();
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println("----------------------************----------------");
		}
	}

}
