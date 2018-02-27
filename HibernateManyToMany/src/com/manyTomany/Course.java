package com.manyTomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ManyToManyCourse")
public class Course {

	@Id
	@Column(name="ID")
	int couseid;
	
	@Column(name="CNAME")
	String coursename;
	
	@ManyToMany(cascade=CascadeType.ALL)
	Set<Student> student;

	
	public int getCouseid() {
		return couseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	
	public void setCouseid(int couseid) {
		// TODO Auto-generated method stub
		this.couseid = couseid;
	}
	
}
