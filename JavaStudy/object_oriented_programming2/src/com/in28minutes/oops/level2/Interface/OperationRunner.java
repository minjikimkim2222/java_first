package com.in28minutes.oops.level2.Interface;

public class OperationRunner {

	public static void main(String[] args) {
		Operation[] operations = { new Add(), new Substract(), new Divide() };

		int result;
		for (Operation operation : operations) {
			result = operation.perform(6, 3);
			System.out.println(result);
		}

	}

}
