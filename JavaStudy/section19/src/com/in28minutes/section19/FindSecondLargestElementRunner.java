package com.in28minutes.section19;

public class FindSecondLargestElementRunner {

	public static void main(String[] args) {
		FindSecondLargestElement secondLargestInt = new FindSecondLargestElement();

		int[] arr = { 5, 5, 5, 4, 4 };
		int result = secondLargestInt.getSecondLargestElement(arr);

		System.out.println("result " + result);

	}

}
