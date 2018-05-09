package list;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs=new ClassPathResource("listbean.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		FruitsName fruits=(FruitsName)factory.getBean("ft1");
		fruits.show();


	}

}
