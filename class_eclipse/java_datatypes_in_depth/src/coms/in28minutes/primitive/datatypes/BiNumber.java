package coms.in28minutes.primitive.datatypes;

public class BiNumber {

	private int num1;
	private int num2;

	BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int add() {
		return (this.num1 + this.num2);
	}

	int multiply() {
		return (this.num1 * this.num2);
	}

	void doubleNums() {
		this.num1 *= 2;
		this.num2 *= 2;
	}

	int getNumber1() {
		return (this.num1);
	}

	int getNumber2() {
		return (this.num2);
	}
}
