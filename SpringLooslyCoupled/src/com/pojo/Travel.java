package com.pojo;

public class Travel implements Journey{

	Vehicle v;
	
	public void setV(Vehicle v) {
		this.v = v;
	}
	@Override
	public void startJourney() {
		// TODO Auto-generated method stub
		System.out.println("Journey started.................");
		v.move();
		
	}


}
