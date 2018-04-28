package com.client;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Student;

public class clientexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("IOC Container-BeanFACTORY- DEMO");
		Resource resource=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Student st=(Student)factory.getBean("s1");
		st.Display();
		
		System.out.println("Spring using Context");
		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Student s1=(Student)ac.getBean("s1");
		s1.Display();
		

	}

}
