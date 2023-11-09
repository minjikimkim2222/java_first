package com.in28minutes.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('Z', 'A', 'A', 'B', 'Z', 'F');

		// unique == Set
		// Tree - 알파벳 순서로 정렬하고 싶다면,
		// Hash - 알파벳 순서나 삽입순서에 상관없이 입력
		// LinkedHash - - 삽입순서대로 갖고 싶다
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet" + treeSet);

		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet " + linkedHashSet);

		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet " + hashSet);
	}

}
