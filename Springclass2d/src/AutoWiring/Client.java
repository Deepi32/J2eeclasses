package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AutoWiringBean.xml"); 
		Traveller v1=(Traveller)ctx.getBean("traveller");
		System.out.println(v1);
		v1.travel();

	}

}
