package com.pojo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDao dao=(StudentDao)ctx.getBean("edao");
		List<Student> list=dao.getAllStudentsRowMapper();
		

		for(Student e:list)
		System.out.println(e);
		
		
	/*	ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentDao dao=(StudentDao)ctx.getBean("edao");
		dao.saveEmployeeByPreparedStatement(new Student(108,"Amit",35000));*/
		
		/*int status=dao.updateEmployee(new Employee(102,"rekha",15000));
		System.out.println(status);
		*/

		/*Employee e=new Employee();
		e.setId(102);
		int status=dao.deleteEmployee(e);
		System.out.println(status);*/

		}

}
