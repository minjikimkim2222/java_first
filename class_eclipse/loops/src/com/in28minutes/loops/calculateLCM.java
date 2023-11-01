package com.in28minutes.loops;

public class calculateLCM {
	private int number1;
	private int number2;

	public calculateLCM(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public int getLCM() {
		// TODO: Write your code here
		if (number1 < 0 || number2 < 0)
			return (-1);

		if (number1 == 0 || number2 == 0)
			return (0);

		int max = Math.max(number1, number2);
		int min = Math.min(number1, number2);

		if (max % number1 == 0)
			return (max);

		int num = 2;
		while (true) {
			int maxMultiply = max * num;

			if (maxMultiply % min == 0)
				return (maxMultiply);
			num++;
		}

	}

}
