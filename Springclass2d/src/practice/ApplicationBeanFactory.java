package practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class ApplicationBeanFactory {
	public static void main1(String[] args) {
		/*Resource rs=new ClassPathResource("practicebean.xml");
		BeanFactory ac=new XmlBeanFactory(rs);
		ac.getBean("ms1");
		ac.getBean("ms1");*/
		final ApplicationContext ac1=new ClassPathXmlApplicationContext("practicebean.xml");
	//	System.out.println("i m initialised");
		ac1.getBean("message");
	//	ac1.getBean("ms1");
		// Message ms=new Message();//=(Message)ac.getBean("ms1");
		// System.out.println("Message is ms"+ms.getMessage());
		Runtime.getRuntime().addShutdownHook(new Thread() {
			   public void run() {
				   ((AbstractApplicationContext) ac1).close();
			   }});
		
	}
	
	
	
	

}
