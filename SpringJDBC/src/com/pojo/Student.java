package com.pojo;

public class Student {
	int sid;
	String sname;
	int salary;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	Student(){}
	Student(int sid,String sname,int salary)
	{
		this.sid=sid;
		this.sname=sname;
		this.salary=salary;
	}
	public String toString()
	{
		return sid+" "+sname+" "+salary;
	} 

}
