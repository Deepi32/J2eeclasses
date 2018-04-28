package com.pojo;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void jdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbcTemplate = jdbctemplate;
	}
	public int saveEmployee(Employee e){  
	    String query="insert into employeesp values(  
	    '"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	}

}
