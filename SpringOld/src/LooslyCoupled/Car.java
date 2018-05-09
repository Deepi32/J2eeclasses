package LooslyCoupled;

public class Car implements Vehicle {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void move() {
		System.out.println("Car is moving...........");
		System.out.println("Speed of car is ::"+speed);
	}
	

}
