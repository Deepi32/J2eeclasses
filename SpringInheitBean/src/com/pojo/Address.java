package com.pojo;

public class Address extends Employee {
	 String streetno;
	 String area;
	public Address(String streetno,String area)
	 {
		super();
		 this.streetno=streetno;
		 this.area=area;
	 }
	public String toString()
	{
		return streetno+" "+area;
	}
	

}
