package com.clientC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.pojo.Test;
public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r=new ClassPathResource("Spring.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Test t=(Test)factory.getBean("t1");
		t.hello();
	}

}
