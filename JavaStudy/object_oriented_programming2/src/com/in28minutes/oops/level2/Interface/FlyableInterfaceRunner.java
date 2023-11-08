package com.in28minutes.oops.level2.Interface;

interface FlyableRunner {
	public void fly();
}

class Bird implements FlyableRunner {
	public void fly() {
		System.out.println("with wings");
	}
}

class Airplane implements FlyableRunner {
	public void fly() {
		System.out.println("with fuels");
	}
}

public class FlyableInterfaceRunner {

	public static void main(String[] args) {
//		// FlyableRunner flyable = new Bird();
//		FlyableRunner flyable = new Airplane();
//		flyable.fly();

		FlyableRunner[] flyable = { new Bird(), new Airplane() };
//		flyable[0].fly();
//		flyable[1].fly();

		for (FlyableRunner flyables : flyable) {
			flyables.fly();
		}
	}
}
