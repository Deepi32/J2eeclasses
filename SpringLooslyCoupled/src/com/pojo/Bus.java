package com.pojo;

public class Bus implements Vehicle {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		System.out.println("Bus is moving...........");
		System.out.println("Speed of car is ::"+speed);
	}

}
