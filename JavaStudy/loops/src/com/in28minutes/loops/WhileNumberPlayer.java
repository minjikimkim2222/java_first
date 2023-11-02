package com.in28minutes.loops;

public class WhileNumberPlayer {
	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int idx = 1;
		int square = 1;
		while (square <= limit) {
			System.out.print(square + " ");
			idx++;
			square = idx * idx;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() { // 세제곱
		int idx = 1;
		int square = 1;
		while (square <= limit) {
			System.out.print(square + " ");
			idx++;
			square = idx * idx * idx;
		}
		System.out.println();
	}

}
