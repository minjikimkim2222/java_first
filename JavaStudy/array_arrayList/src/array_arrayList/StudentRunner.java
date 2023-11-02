package array_arrayList;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		int[] marks = {100, 1200, 90};
		Student student = new Student("minji", marks);
		
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

	}

}
