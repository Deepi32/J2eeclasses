package Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Inheritancebean.xml");
		HelloWorld objA = (HelloWorld) ctx.getBean("helloWorld");
	      objA.getMessage1();
	      objA.getMessage2();

	      HelloIndia objB = (HelloIndia) ctx.getBean("helloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();

	}

}
