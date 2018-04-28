package com.tablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.tablePerConcreteClass.HEmployee;
import com.tablePerConcreteClass.SEmployee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfiguration an=new AnnotationConfiguration();
		an.configure("hibernate.cfg.xml");
		SessionFactory factory=an.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		SEmployee semp=new SEmployee();
		semp.setEmpid("E7");
		semp.setName("Niru");
		semp.setSalary(280000);
		
		HEmployee hemp=new HEmployee();
		hemp.setEmpid("E9");
		hemp.setHours(3);
		hemp.setName("Nisha");
		hemp.setSalaryperhour(1900);
		
		session.save(semp);
		session.save(hemp);
		t.commit();
		System.out.println("Adding of data done............");
		

	}

}
