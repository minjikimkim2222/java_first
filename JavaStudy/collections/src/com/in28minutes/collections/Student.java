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
	/*
	 * compareTo 메소드가 음수를 반환하면, Collections.sort 메소드는 첫 번째 객체를 두 번째 객체보다 앞쪽에 배치하게
	 * 됩니다. 이는 첫 번째 객체가 두 번째 객체보다 작다는 의미입니다.
	 * 
	 * 반대로, compareTo 메소드가 양수를 반환하면, Collections.sort 메소드는 첫 번째 객체를 두 번째 객체보다 뒤쪽에
	 * 배치하게 됩니다. 이는 첫 번째 객체가 두 번째 객체보다 크다는 의미입니다.
	 * 
	 * 결국, compareTo 메소드의 반환값에 따라 객체들이 정렬되는 순서가 결정되게 됩니다.
	 * 
	 */
}
