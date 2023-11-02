package array_arrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	private String name;
	private int[] marks;

	public Student(String name, int... marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
//		int count = 0;
//		
//		for (int idx = 0; idx < this.marks.length; idx++)
//			count++;
//		return (count);
		return (marks.length);
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		
		for (int idx : marks) {
			sum = sum + idx;
		}
		return (sum);
	}

	public int getMaximumMark() {
		int maximumMark = marks[0];
		for (int idx = 0; idx < marks.length; idx++) {
			if (maximumMark < marks[idx]) {
				maximumMark = marks[idx];
			}
		}
		return (maximumMark);
	}

	public int getMinimumMark() {
		int minimumMark = marks[0];
		for (int idx = 0; idx < marks.length; idx++) {
			if (minimumMark > marks[idx]) {
				minimumMark = marks[idx];
			}
		}
		return (minimumMark);
	}

	public BigDecimal getAverageMask() {
		
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
	
		return (new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.DOWN));
	}
	
	
	

}
