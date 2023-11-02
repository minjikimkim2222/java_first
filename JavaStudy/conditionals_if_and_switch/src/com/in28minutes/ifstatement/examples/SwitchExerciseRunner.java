package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input Day number (0~6) : ");
		Scanner scanner_day = new Scanner(System.in);
		int day = scanner_day.nextInt();

		SwitchExercise switchExercise = new SwitchExercise();
		System.out.printf("day is %s\n", switchExercise.deterMineNameofDay(day));

		System.out.println("input Month number (1~12) : ");
		Scanner scannerMonth = new Scanner(System.in);
		int monthNumber = scannerMonth.nextInt();
		System.out.printf("month is %s\n", switchExercise.determineNameOfMonth(monthNumber));

		if (switchExercise.isWeekDay(day)) {
			System.out.println("day is a Week Day");
		} else {
			System.out.println("day is not a Week Day");
		}

	}

}
