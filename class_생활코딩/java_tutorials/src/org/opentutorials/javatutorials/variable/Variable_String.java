package org.opentutorials.javatutorials.variable;

public class Variable_String {

	public static void main(String[] args) {
		String first = "java";
		System.out.println(first + " let's start");
		
		String a,b;
		
		a = "minji";
		b = " hyunji";
		
		System.out.println("a + b");
		System.out.println(a + b);
		
		test_char.printChar();
	}

}

// char 출력을 따로 떼어내보고 싶어서, main메소드에서 printCha메소드를 따로 써봄

class test_char {
	public static void printChar() {
	
		char c = 'a';
		System.out.println(c);
	}
}
