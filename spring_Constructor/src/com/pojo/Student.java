package com.pojo;

public class Student {
	int rollno;
	String name;
	String subject;

	public Student(int rollno, String name, String subject) {
		this.rollno = rollno;
		this.name = name;
		this.subject = subject;
	}

	public void display()
	{
		System.out.println("Roll No:: "+rollno+" Name:: "+name+"  Subject:: "+subject);
	}

	
}
