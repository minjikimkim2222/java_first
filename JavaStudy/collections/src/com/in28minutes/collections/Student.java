package com.in28minutes.collections;

public class Student implements Comparable<Student> { // 다른 학생과 비교하길 바람, 비교대상 : Student
	private int id; // 정수형이나 문자열은 이미 Comparable inteface가 구현되어 있기 때문에 구현안해도 됨
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// override
	public String toString() {
		return (getId() + " " + getName());
	}

	@Override
	public int compareTo(Student that) {

//		return (Integer.compare(this.id, that.id)); // 오름차순
		return (Integer.compare(that.id, this.id)); // 내림차순
	}

}
