package coms.in28minutes.primitive.datatypes;

public class FindLongestWordRunner {

	public static void main(String[] args) {
		String str = "This is a test sentence";

		FindLongestWord LongestWord = new FindLongestWord();

		System.out.printf("longest str : %s", LongestWord.getLongestWord(str));
	}

}
