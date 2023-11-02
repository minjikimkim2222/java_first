package coms.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('P');

		System.out.println(myChar.isVowel());
		// 'a', 'e', 'i', 'o', 'u' and Capitals
		System.out.println(myChar.isConsonant());

		System.out.println(myChar.isAlphabet());

		System.out.println(myChar.isDigit());

		MyChar.printLowerCaseAlphabets(); // static 클래스는 myChar로 instance를 안 만들어도, 바로 MyChar 객체로 호출 가
		System.out.println();
		MyChar.printUpperCaseAlphabets();
	}

}
