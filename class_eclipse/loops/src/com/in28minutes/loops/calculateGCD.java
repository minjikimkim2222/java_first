package com.in28minutes.loops;

public class calculateGCD {
	private int number1;
	private int number2;

	public calculateGCD(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public int getGCD() {
		if (number1 < 0 || number2 < 0)
			return (1);
		if (number1 == 0 || number2 == 0)
			return (0);
		if (number1 == number2)
			return (number1);

		int min = Math.min(number1, number2);

		int gcd = 1;
		int finalGCD = 1;
		while (true) {

			if (gcd == min)
				return (finalGCD);

			if (number1 % gcd == 0 && number2 % gcd == 0)
				finalGCD = gcd;
			gcd++;
		}

	}
}