package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.basic.Employee;

public class PartialAllColumns {
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
		
		Projection p1=Projections.property("empid");
		ProjectionList plist=Projections.projectionList();
		plist.add(p);
		plist.add(p1);
		Criterion cr=Restrictions.gt("empid",4);
		criteria.setProjection(plist);
		criteria.add(cr);
		List list=criteria.list();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Object obj[]=(Object[])itr.next();
			
			System.out.println(obj[0]+"   "+obj[1]);
		}
	}


}
