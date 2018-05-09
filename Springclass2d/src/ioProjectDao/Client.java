package ioProjectDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ipProjectDaobean.xml");
		ProductService ps=(ProductService)ctx.getBean("productService");
		ps.createproduct(101,"Pd1");

	}

}
