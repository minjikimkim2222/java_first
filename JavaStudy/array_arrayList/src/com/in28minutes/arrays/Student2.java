
package com.in28minutes.arrays;

import java.math.BigDecimal;

import java.math.RoundingMode;
import java.util.ArrayList;


public class Student2{
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>(); // ArrayList 추가  

	public Student2(String name, int... marks) {
		this.name = name;
		
		for (int mark : marks) { // 생성자 또한 수정, 가변인자가 들어올 때마다 add 
			this.marks.add(mark);
		}

	}


	public int getNumberOfMarks() {

		return (marks.size());
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		
		for (int idx : marks) {
			sum = sum + idx;
		}
		return (sum);
	}

	public int getMaximumMark() {
		int maximumMark = marks.get(0);
		for (int idx = 0; idx < marks.size(); idx++) {
			if (maximumMark < marks.get(idx)) {
				maximumMark = marks.get(idx);
			}
		}
		return (maximumMark);
	}

	public int getMinimumMark() {
		int minimumMark = marks.get(0); // ArrayList는 []를 통해 index 접근 불가능 , get() 메서드 이용 
		for (int idx = 0; idx < marks.size(); idx++) {
			if (minimumMark > marks.get(idx)) {
				minimumMark = marks.get(idx);
			}
		}
		return (minimumMark);
	}

	public BigDecimal getAverageMask() {
		
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
	
		return (new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.DOWN));
	}
	
	// add, remove 메서드 추가 
	public void addNewMark(int mark) {
		marks.add(mark);
	}
	
	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}
	
	
	

}