package com.pojo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("Bean.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Category cg=(Category)factory.getBean("ct1");
		cg.show();

	}

}
