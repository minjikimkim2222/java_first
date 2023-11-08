package com.in28minutes.oops.level2.Interface;

abstract class Animal {
	public abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("Meow Meow");
	}
}

public class AnimalAbstractClassRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			animal.bark();
		}

	}

}
