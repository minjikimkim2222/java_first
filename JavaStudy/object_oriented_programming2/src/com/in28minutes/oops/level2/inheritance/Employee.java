package com.in28minutes.oops.level2.inheritance;

public class Employee extends Person {
	private String jobTitle;
	private String employerName;
	private char employeeGrade; // 'A', 'B', 'C', 'D', 'E', 'F'
	private int salary;

	// setter

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		String employeeStr = "jobTitle : " + jobTitle + " employerName : " + employerName + " employeeGrade : "
				+ employeeGrade + " salary : " + salary;

		String personStr = "\n + name : " + getName() + " email : " + getEmail() + " phone : " + getPhoneNumber();
		return employeeStr + personStr;
	}

}
