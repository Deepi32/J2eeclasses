package AopExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AopExampleBean.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("AopExample.xml");
		MyMathImpl mi=(MyMathImpl)ctx.getBean("myMathImpl");
		mi.add(7,9);
		mi.sub(5, 2);
		mi.div(6, 0);
	}

}
