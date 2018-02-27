package com.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.basic.Employee;

public class SelectAllRowAllColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
	//	String hqlquery="select e from Employee e";
		String hqlquery="from Employee ";
		Query query=session.createQuery(hqlquery);
		List list=query.list();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Employee emp=(Employee)itr.next();
			System.out.println(emp.getEmpid());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			System.out.println("--------------------");
		}
		System.out.println("select statement done..............");
	}

}
