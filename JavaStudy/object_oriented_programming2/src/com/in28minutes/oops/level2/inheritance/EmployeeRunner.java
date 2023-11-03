package com.in28minutes.oops.level2.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.setName("Yongtae");
		employee.setPhoneNumber("010-xxxx-yyyy");
		employee.setEmail("anything@gmail.com");

		employee.setJobTitle("회장 ");
		employee.setName("minji");
		employee.setEmployeeGrade('A');
		employee.setSalary(10000000);

		System.out.println(employee.toString());
	}

}
