package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.basic.Employee;

public class PartialOneColumn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		Projection p=Projections.property("name");
		criteria.setProjection(p);
		List list=criteria.list();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String  e=(String)itr.next();
			System.out.println(e);
		}
	}


}
