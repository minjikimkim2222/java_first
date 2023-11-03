package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
	private String college;

	private int myClass;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getYear() {
		return this.myClass;
	}

	public void setYear(int myClass) {
		this.myClass = myClass;
	}

}
