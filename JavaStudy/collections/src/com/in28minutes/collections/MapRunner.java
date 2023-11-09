package com.in28minutes.collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion" + "This has never happened before";

		// 각 글자의 등장횟수를 Map에 저장할 것 - Key , value
		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();

		for (char character : characters) {
			// Get the character
			Integer integer = occurances.get(characters);

			if (integer == null) {
				occurances.put(character, 1);
			}

			else {
				occurances.put(character, integer + 1);
			}
			// if it is there, we increment the count
			// if is not there, initialize to 1

		}

		System.out.println(occurances);

	}

}
