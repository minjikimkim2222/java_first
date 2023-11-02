package com.in28minutes.introduction;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book harryPotter = new Book(100);
		Book effectiveJava = new Book(50);

//		harryPotter.setVar(100);
//		effectiveJava.setVar(30);
//
//		harryPotter.increaseVar(200);
//		effectiveJava.increaseVar(70);
//
//		harryPotter.decreaseVar(90);
//		effectiveJava.decreaseVar(30);

		System.out.println(harryPotter.getVar());
		System.out.println(effectiveJava.getVar());
	}

}
