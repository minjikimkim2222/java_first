package coms.in28minutes.primitive.datatypes;

public class BiNumber {

	private int num1;
	private int num2;

	public BiNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		return (this.num1 + this.num2);
	}

	public int multiply() {
		return (this.num1 * this.num2);
	}

	public void doubleNums() {
		this.num1 *= 2;
		this.num2 *= 2;
	}

	public int getNumber2() {
		// TODO Auto-generated method stub
		return this.num2;
	}

	public int getNumber1() {
		// TODO Auto-generated method stub
		return this.num1;
	}

}
