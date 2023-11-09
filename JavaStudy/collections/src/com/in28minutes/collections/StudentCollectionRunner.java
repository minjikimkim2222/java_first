package com.in28minutes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {

		return (Integer.compare(student1.getId(), student2.getId()));
	}

}

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

		System.out.println("내림차순 " + studentsAI);

		Collections.sort(studentsAI, new DescendingStudentComparator());

		System.out.println("DescedingStudentComparator " + studentsAI);
	}

}
