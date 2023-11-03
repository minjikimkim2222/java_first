package com.in28minutes.oops.level2;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length2, int width2) {
		length = length2;
		width = width2;
	}

	public String toString() {
		return String.format("length : %d, width : %d", length, width);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length <= 0)
			return;
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width <= 0)
			return;
		this.width = width;
	}

	public int area() {
		return (length * width);
	}

	public int perimeter() {
		return (2 * (length + width));
	}

}
