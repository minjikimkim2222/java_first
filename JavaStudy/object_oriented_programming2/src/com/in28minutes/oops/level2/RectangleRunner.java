package com.in28minutes.oops.level2;

public class RectangleRunner {

	public static void main(String[] args) {
		int length = 10;
		int width = 30;

		Rectangle rectangle = new Rectangle(length, width);
		System.out.println(rectangle);

		rectangle.setLength(-1);
		System.out.println(rectangle);

		rectangle.setLength(13);
		System.out.println(rectangle);

		int area = rectangle.area();
		System.out.println(area);

		int perimeter = rectangle.perimeter();
		System.out.println(perimeter);

	}

}
