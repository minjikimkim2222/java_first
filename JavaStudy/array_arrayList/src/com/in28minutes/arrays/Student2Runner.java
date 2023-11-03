package com.in28minutes.arrays;

import java.math.BigDecimal;

public class Student2Runner {

	public static void main(String[] args) {
		
		int[] marks = {100, 1200, 90};

		Student2 student = new Student2("minji", marks);
		
		int number = student.getNumberOfMarks();
		System.out.println("number : " + number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("sum : " + sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("maximumMark : " + maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("minimumMark : " + minimumMark);
		
		BigDecimal average = student.getAverageMask();
		System.out.println("average : " + average);
		
		student.addNewMark(34);
		student.removeMarkAtIndex(0);

	}

}