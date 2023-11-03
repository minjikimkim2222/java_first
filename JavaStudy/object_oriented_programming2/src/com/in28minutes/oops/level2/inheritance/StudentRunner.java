package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();

		student.setName("minji");
		student.setEmail("any email address");

		Person person = new Person();

		System.out.println(person.toString());

		person.setName("minji");
		person.setEmail("naver.com");
		System.out.println(person.toString());

	}

}
