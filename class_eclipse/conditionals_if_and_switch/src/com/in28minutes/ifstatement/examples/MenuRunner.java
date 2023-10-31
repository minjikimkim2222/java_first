package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number1: ");

		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt(); // 정수를 읽어오는 메소드

		System.out.println("Enter Number2: ");
		Scanner scanner2 = new Scanner(System.in);

		int number2 = scanner2.nextInt();

		// 입력 완료
		Menu menu = new Menu(number1, number2);
		System.out.println("Choose Operation: ");

		Scanner scanner3 = new Scanner(System.in);
		int operationNum = scanner3.nextInt();

		int result = menu.operation(operationNum);

		if (result == -1) {
			System.out.println("invalid operation");

		} else {
			System.out.println("Result is : " + result);
		}
	}

}
