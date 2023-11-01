package com.in28minutes.loops;

public class MyNumber {

	private int num;

	public MyNumber(int i) {
		this.num = i;
	}

	public boolean isPrime() { // 1과 자기자신을 제외한 다른 숫자로 나눠지면 안되는 숫자 = 소수
		if (num == 1)
			return (false); // 1은 소수가 아니
		else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0)
					return (false);
			}
			return (true);
		}
	}

	public int sumUptoN() { // Sum of numbers upto N
		int totalSum = 0;
		for (int i = 1; i <= num; i++) {
			totalSum += i;
		}
		return (totalSum);
	}

	public int sumOfDivisors() { // 1과 자기자신을 제외한 약수의 합
		int totalSum = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				totalSum += i;
		}
		return (totalSum);
	}

	public void printANumberTriangle() {
		for (int i = 0; i < num; i++) {
			for (int j = 0; i >= j; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
	}

}
