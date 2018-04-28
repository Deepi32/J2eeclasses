import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource re=new ClassPathResource("bean.xml");
		BeanFactory factory=new XmlBeanFactory(re);
		Student st=(Student)factory.getBean("stobject");
		st.display();
		st.display();
		st.display();
		System.out.println("using context.........................");
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Student st1=(Student)factory.getBean("stobject");
		st1.display();
		
		
		

	}

}
