package CollectionObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("CollectionObjectBean.xml");
		MyCollection mc=(MyCollection)ap.getBean("client");
		System.out.println(mc);
		
	
	}

}
