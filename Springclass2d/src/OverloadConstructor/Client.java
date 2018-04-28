package OverloadConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("OverloadConstructorBean.xml");
		Product p1=(Product)ac.getBean("product1");
		System.out.println(p1);
		Product p2=(Product)ac.getBean("product2");
		System.out.println(p2);
		Product p3=(Product)ac.getBean("product3");
		System.out.println(p3);
		
	}

}
