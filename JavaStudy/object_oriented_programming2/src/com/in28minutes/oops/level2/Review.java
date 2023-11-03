package com.in28minutes.oops.level2;

public class Review {
	// state
	private int id;
	private String description;
	private int rating;

	// constuctor

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	// toString
	public String toString() {
		return (description);
	}

}
