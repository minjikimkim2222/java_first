package com.in28minutes.oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming with Java", "minji");

		book.addReview(new Review(10, "Great Book", 5));

		System.out.println(book);

		book.addReview(new Review(10, "Awesome", 5));

		System.out.println(book);

	}

}
