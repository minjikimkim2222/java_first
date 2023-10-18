package com.in28minuites.firstjavaproject;

public class examples_완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumberChecker num = new PerfectNumberChecker();

		num.isPerfectNumber(100);

	}

}

class PerfectNumberChecker {
	/* 1번. 약수의 정의를 이용해 구함 */
//	public boolean isPerfectNumber(int number) {
//		if (number <= 0)
//			return (false);
//
//		int sum = 0;
//		boolean isItPerfectNumber = false;
//
//		for (int i = 1; i < number; i++) {
//			if (number % i == 0) {
//				sum += i;
//			}
//		}
//
//		if (sum == number) {
//			isItPerfectNumber = true;
//		}
//
//		return (isItPerfectNumber);
//	}

	/* 2번. 효율적으로 약수를 구하는 알고리즘 */

	public boolean isPerfectNumber(int number) {
		if (number <= 0)
			return (false);

		int sum = 0;
		int share = 0;
		boolean isItPerfectNumber = false;

		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				sum += i;
				share = (number / i);
				sum += share;
				if (i == share)
					sum -= i;
				// System.out.printf("i : %d, share : %d, sum : %d", i, share, sum).println();
			}
		}

		sum -= number;
		System.out.println("sum : " + sum);

		if (sum == number) {
			isItPerfectNumber = true;
		}

		return (isItPerfectNumber);
	}
}