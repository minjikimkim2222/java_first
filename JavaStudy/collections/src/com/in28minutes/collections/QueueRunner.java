package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length()); // 길이 - 오름차순 정렬
	}

}

public class QueueRunner {

	public static void main(String[] args) {

// 1. natural order 

//		Queue<String> queue = new PriorityQueue<>();
//
//		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

//		System.out.println(queue);
//
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());

// 2 - 사용자 지정 order (문자열의 길이가 짧은 것부터 저장되길 원함 ) - Comparator interface 
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue); // toString() 은 정렬순서 보장해주 않음
		System.out.println(queue.poll()); // 반면, Poll() 메서드는 큐에서 가장 우선순위가 높은 요소를 제거하고 반환
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
