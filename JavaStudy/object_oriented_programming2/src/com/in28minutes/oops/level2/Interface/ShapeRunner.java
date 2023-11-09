package com.in28minutes.oops.level2.Interface;

public class ShapeRunner {

	public static void main(String[] args) {
		Shape circle = new Circle("Circle", 5.0); // Here, "Circle" is the name and 5.0 is the radius

		Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0); // Here, "Rectangle" is the name, 4.0 is the length, and
																// 6.0 is the width

		circle.displayInfo();

		rectangle.displayInfo();

	}

}
