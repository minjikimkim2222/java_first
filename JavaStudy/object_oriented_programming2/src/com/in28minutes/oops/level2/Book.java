package com.in28minutes.oops.level2;

public class Book {
	// state
	private int id;
	private String name;
	private String author;
	private Review review;

	// constuctor
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		this.review = review;
	}

	// toString
	public String toString() {
		return String.format("book : [ id - %d, name : %s, author : %s, review : %s]", id, name, author, review);
	}
}
