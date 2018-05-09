package Scope;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs=new ClassPathResource("Scopebean.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		factory.getBean("test");
		factory.getBean("test");
		factory.getBean("test");
	}

}
