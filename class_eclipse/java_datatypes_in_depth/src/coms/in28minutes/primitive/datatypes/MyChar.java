package coms.in28minutes.primitive.datatypes;

public class MyChar {
	private static char c;

	public MyChar(char c) {
		this.c = c;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return (true);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return (true);
		return (false);
	}

	public boolean isConsonant() {

		if (isAlphabet() && !isVowel())
			return (true);
		return (false);
	}

	public boolean isAlphabet() {
		if (c >= 'a' && c <= 'z')
			return (true);
		if (c <= 'A' && c >= 'Z')
			return (true);
		return (false);
	}

	public boolean isDigit() {
		if (c >= '0' && c <= '9')
			return (true);
		return (false);
	}

	public static void printLowerCaseAlphabets() {
		// print 'a' to 'z'
		char ch = 'a';
		for (int i = 0; i <= 25; i++)
			System.out.printf("%c", ch + i);
	}

	public static void printUpperCaseAlphabets() {
		char ch = 'A';
		for (int i = 0; i <= 25; i++)
			System.out.printf("%c", ch + i);
	}

}
