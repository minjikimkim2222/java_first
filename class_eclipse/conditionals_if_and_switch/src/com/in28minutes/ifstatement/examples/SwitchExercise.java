package com.in28minutes.ifstatement.examples;

public class SwitchExercise {

	private String day;
	private String month;

	public String deterMineNameofDay(int day2) {
		// TODO Auto-generated constructor stub
		switch (day2) {
		case 0:
			this.day = "Sunday";
			break;
		case 1:
			this.day = "Monday";
			break;
		case 2:
			this.day = "Tuesday";
			break;
		case 3:
			this.day = "Wednesday";
			break;
		case 4:
			this.day = "Thursday";
			break;
		case 5:
			this.day = "Friday";
			break;
		case 6:
			this.day = "Saturday";
			break;
		default:
			System.out.println("invalid input, day");

		}
		return day;

	}

	public String determineNameOfMonth(int monthNumber) {
		// TODO Auto-generated method stub
		switch (monthNumber) {
		case 1:
			this.month = "January";
			break;
		case 2:
			this.month = "February";
			break;
		case 3:
			this.month = "March";
			break;
		case 4:
			this.month = "April";
			break;
		case 5:
			this.month = "May";
			break;
		case 6:
			this.month = "June";
			break;
		case 7:
			this.month = "July";
			break;
		case 8:
			this.month = "August";
			break;
		case 9:
			this.month = "September";
			break;
		case 10:
			this.month = "October";
			break;
		case 11:
			this.month = "November";
			break;
		case 12:
			this.month = "December";
			break;
		default:
			System.out.println("invalid input, month");

		}
		return month;

	}

	public boolean isWeekDay(int day) {
		// TODO Auto-generated method stub

		switch (day) {
		case 0:
			return (false); // 주말
		case 6:
			return (false); // 주말
		default:
			return (true); // 평일
		}
	}
}
