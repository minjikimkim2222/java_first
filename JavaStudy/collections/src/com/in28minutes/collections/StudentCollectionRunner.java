package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = List.of(new Student(1, "minji"), new Student(100, "hyunji"),
				new Student(3, "yongtae"));

//		for (Student student : students) {
//			System.out.println(student);
//		}

		// sort

		ArrayList<Student> studentsAI = new ArrayList<>(students);
		Collections.sort(studentsAI);

		System.out.println("sort after");
		for (Student student : studentsAI) {
			System.out.println(student);
		}
	}

}
