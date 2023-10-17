package com.in28minuites.firstjavaproject;

public class MultiplicationTable {
	
	void print(){ // 5단 only
		print(5);
	}
	
	void print(int table)
	{
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to)
	{
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d\n", table, i, table * i);
		}
	}
}