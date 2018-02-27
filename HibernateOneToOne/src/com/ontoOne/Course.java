package com.ontoOne;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HibernateOneToOneCc")
public class Course {

	
	@Id
	@Column(name="ID")
	int couseid;
	
	@Column(name="CNAME")
	String coursename;
	
	@OneToOne(cascade=CascadeType.ALL)
	Student st;
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public int getCouseid() {
		return couseid;
	}
	public void setCouseid(int couseid) {
		this.couseid = couseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}
