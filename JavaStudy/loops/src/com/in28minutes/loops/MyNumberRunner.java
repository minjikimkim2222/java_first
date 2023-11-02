package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNumber number = new MyNumber(5);

		System.out.println(number.isPrime());

		int sum = number.sumUptoN();
		System.out.println("sumUptoN " + sum);

		int sumOfDivisior = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisior);

		number.printANumberTriangle();
	}

}
