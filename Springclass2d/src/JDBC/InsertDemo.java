package JDBC;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("JDBCBean.xml");
		DataSource d1=(DataSource)ac.getBean("ds");
		JdbcTemplate jt=new JdbcTemplate(d1);
		System.out.println("jt is"+jt);
	//	String str="Insert into employee(id,name,Salary,Eid,ENAME) values(?,?,?,?,?)";
	//	jt.update(str, 103,"Deeps",78000,"deepi3242","");
		
	//	String str1="Delete from employee where id= ?";
	//	jt.update(str1,103);
		
		String str2="select * from employee";
		List<Map<String,Object>> list=jt.queryForList(str2);
		Iterator<Map<String,Object>> itr=list.iterator();
		while(itr.hasNext())
		{
			Map m1=itr.next();
			System.out.println("Emp id is"+m1.get("id"));
			System.out.println("Emp name is"+m1.get("name"));
			System.out.println("Salary is "+m1.get("salary"));
			
		}
		

	}

}
