package com.in28minutes.arrays;
import java.lang.String;
public class StringRunner {

	public static void main(String[] args) {
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday" };

		String longestString = days[0];
		for (int i = 0; i < days.length - 1; i++) {

			if (days[i].length() < days[i + 1].length()) {
				longestString = days[i + 1];
			}
		}
		System.out.println("Day with longest String" + longestString);
		
		for (String day : days) {
			System.out.println(day);
		}
	}

}
