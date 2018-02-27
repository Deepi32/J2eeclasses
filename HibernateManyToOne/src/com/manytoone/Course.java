package com.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="HibernateManyToOneCT")
public class Course {

	
	@Id
	@Column(name="ID")
	int couseid;
	
	@Column(name="CNAME")
	String coursename;
	
	@ManyToOne(cascade=CascadeType.ALL)
	STudent st;
	public STudent getSt() {
		return st;
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
	public void setSt(STudent st) {
		this.st = st;
		// TODO Auto-generated method stub
		
	}
	
}
