package com.in28minutes.section19;

public class FindSecondLargestElement {
	private int[] array;

	public int getSecondLargestElement(int[] array) {

		if (array.length == 0)
			return (-1);

		int firstLargestInt = Integer.MIN_VALUE;
		int secondLargestInt = Integer.MIN_VALUE;

		for (int arr : array) {

			if (arr > firstLargestInt) {
				secondLargestInt = firstLargestInt;
				firstLargestInt = arr;
			} else if (arr > secondLargestInt && arr != firstLargestInt) { // 계속 테스트를 보면서 조건을 수정해나갈 것 !
				secondLargestInt = arr;
			}
		}

		if (secondLargestInt == Integer.MIN_VALUE)
			return (-1);

		return (secondLargestInt);
	}
}