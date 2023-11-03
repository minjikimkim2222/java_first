package com.in28minutes.oops.level2;

public class Fan {
	// state
	private String name;
	private double radius;
	private String color;
	private boolean isOn;
	private int speed;

	// constructors
	public Fan(String name, double radius, String color) {
		this.name = name;
		this.radius = radius;
		this.color = color;
	}

	// print the state
	public String toString() {
		return String.format("name : %s , radius : %f, color : %s, isOn : %b, speed : %d", name, radius, color, isOn,
				speed);
	}

	// behaviors: methods
	void switchOn() {
		this.isOn = true;
		this.speed = 5;
	}

	void switchOff() {
		this.isOn = false;
		this.speed = 0;
	}

	void changeSpeed(int speed) {
		this.speed = speed;
	}

}
