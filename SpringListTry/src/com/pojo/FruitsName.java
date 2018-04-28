package com.pojo;

import java.util.List;
import java.util.Set;

public class FruitsName {
	List fruitsname;
	Set coursename;
	public List getFruitsname() {
		return fruitsname;
	}
	public void setFruitsname(List fruitsname) {
		this.fruitsname = fruitsname;
	}
	public Set getCoursename() {
		return coursename;
	}
	public void setCoursename(Set coursename) {
		this.coursename = coursename;
	}
	public void show()
	{
		System.out.println("Fruit list is :"+fruitsname);
		System.out.println("Course names are :: "+coursename);
	}
	
	
}
