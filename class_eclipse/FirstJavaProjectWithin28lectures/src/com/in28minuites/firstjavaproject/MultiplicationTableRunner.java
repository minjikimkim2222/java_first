package com.in28minuites.firstjavaproject;

public class MultiplicationTableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable table = new MultiplicationTable();
		
		//table.print();
		System.out.println("method overloading");
		//table.print(7);
		System.out.println("more general method");
		System.out.println("avoid duplication, refactoring");
		table.print();
		
		
	}

}
