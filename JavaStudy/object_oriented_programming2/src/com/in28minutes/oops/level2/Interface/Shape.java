package com.in28minutes.oops.level2.Interface;

public abstract class Shape {
	protected String name;

	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();

	public void displayInfo() {
		System.out.print("Shape : " + name);
		System.out.println("Area : " + calculateArea());
	}

}

class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double calculateArea() { // 오버라이딩

		return (Math.PI * radius * radius);
//		return ();

	}
}

class Rectangle extends Shape {
	private double length, width;

	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public double calculateArea() { // 오버라이딩

		return (length * width);

	}
}