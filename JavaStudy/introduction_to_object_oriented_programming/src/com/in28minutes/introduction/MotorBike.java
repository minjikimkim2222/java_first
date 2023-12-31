package com.in28minutes.introduction;

public class MotorBike {

	// state
	private int speed;

	// behavior
	MotorBike(int speed) {
		this.speed = speed;
	}

	public void start() {
		System.out.println("Bike started");
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public int getSpeed() {
		return (this.speed);
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
