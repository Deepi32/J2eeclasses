package com.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.basic.Employee;

public class AddingConditions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Criteria criteria=session.createCriteria(Employee.class);
		//Criterion cr=Restrictions.ge("empid",3);
		Criterion cr=Restrictions.between("empid",new Integer(3),new Integer(6));
		criteria.add(cr);
		List list=criteria.list();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			Employee e=(Employee)itr.next();
			System.out.println(e.getEmpid());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
	}


}
