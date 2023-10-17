package com.in28minuites.firstjavaproject;

public class MultiplicationTable {
	
	void print(){ // 5단 only
		for (int i = 1; i <= 10; i++) {
			System.out.printf("5 * %d = %d\n", i, 5 * i);
		}
	}
	
	void print(int table)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", table, i, table * i);
		}
	}
	
	void print(int table, int from, int to)
	{
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d\n", table, i, table * i);
		}
	}
}