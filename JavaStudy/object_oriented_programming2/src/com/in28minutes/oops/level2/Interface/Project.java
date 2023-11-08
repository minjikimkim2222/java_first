package com.in28minutes.oops.level2.Interface;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ComplexAlgorithm complexAlgorithm = new DummyAlgorithm();
		ComplexAlgorithm complexAlgorithm = new RealAlgorithm();
		int num = complexAlgorithm.complexAlgorithm(3, 5);

		System.out.println(num);
	}

}
