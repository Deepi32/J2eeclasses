package inheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("InheritBean.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Employee emp=(Employee)factory.getBean("e3");
		emp.show();

	}

}
