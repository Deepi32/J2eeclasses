package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("practicebean.xml");
		//ctx.getBean(arg0);

	}

}
