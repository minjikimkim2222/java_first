package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//
//		// student.setName("minji");
//		student.setEmail("any email address");
//
//		System.out.println(student);
//
//		Person person = new Person();
//
//		System.out.println(person);
//
//		// person.setName("minji");
//		person.setEmail("naver.com");
//		System.out.println(person.toString());

		String name = "kim Min ji";
		String jobTitle = "Writer";
		Employee employee = new Employee(name, jobTitle);

		employee.setEmail("minji@naver.com");
		employee.setPhoneNumber("010-xxx-yyyy");
		employee.setEmployeeGrade('A');
//		employee.setJobTitle("Programmer Analyst");

		System.out.println(employee);

	}

}
