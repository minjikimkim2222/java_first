package com.in28minutes.introduction;

public class Book {
	private int noOfCopies;

	Book(int val) {
		noOfCopies = val;
	}

	void setVar(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}

	public int getVar() {
		return (this.noOfCopies);
	}

	public void increaseVar(int howMuch) {
		setVar(this.noOfCopies + howMuch);
	}

	public void decreaseVar(int howMuch) {

//		if (this.noOfCopies - howMuch > 0)
//			this.noOfCopies - howMuch; -> 더 효율적으로, 검사가 중복되지 않게!
		setVar(this.noOfCopies - howMuch);
	}
}
