package com.in28minutes.ifstatement.examples;

public class Menu {
	private int number1;
	private int number2;

	public Menu(int number1, int number2) {
		// TODO Auto-generated constructor stub
		this.number1 = number1;
		this.number2 = number2;
	}

	public int operation(int num) {
		if (num == 1) {
			return (number1 + number2);
		} else if (num == 2) {
			return (number1 - number2);
		} else if (num == 3) {
			return (number1 / number2);
		} else if (num == 4) {
			return (number1 * number2);
		} else {
			return (-1);
		}
	}

}
