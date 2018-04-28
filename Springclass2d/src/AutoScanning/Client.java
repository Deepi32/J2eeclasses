package AutoScanning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AutoScanningBean.xml"); 
		MessageBean mb=(MessageBean)ctx.getBean("messageBean");
		System.out.println(mb);

	}

}
