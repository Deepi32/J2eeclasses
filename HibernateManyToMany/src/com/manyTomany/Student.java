package com.manyTomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="ManyToManyStudent")
public class Student {
	
	@Id
	@Column(name="SID")
	int sid;
	
	@Column(name="SNAME")
	String name;
	@Column(name="SEmail")
	String email;
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Course> courses;
	
	public int getSid() {
		return sid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public void setSid(int sid) {
		// TODO Auto-generated method stub
		this.sid = sid;
	}


}
