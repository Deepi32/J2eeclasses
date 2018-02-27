package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HibernateOneToManyCc")
public class Course {

	
	@Id
	@Column(name="ID")
	int couseid;
	
	@Column(name="CNAME")
	String coursename;
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
