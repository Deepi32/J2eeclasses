package LooslyCoupled;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource rs=new ClassPathResource("Springframework1.xml");
		BeanFactory factory1=new XmlBeanFactory(rs);
		Resource rs1=new ClassPathResource("Springframework2.xml");
		BeanFactory factory2=new XmlBeanFactory(rs1,factory1);
		
		Travel tr=(Travel)factory2.getBean("travel1");
		tr.startJourney();
	}

}
