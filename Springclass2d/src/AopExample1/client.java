package AopExample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
	public static void main(String[] args) 
	{ 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AopExample1.xml");
		MyMathImpl mm=(MyMathImpl)ctx.getBean("pf"); 
		mm.add(3, 5);  
		} 
			 
	} 


