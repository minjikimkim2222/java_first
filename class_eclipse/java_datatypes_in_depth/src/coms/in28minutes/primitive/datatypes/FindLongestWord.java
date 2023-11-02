package coms.in28minutes.primitive.datatypes;

public class FindLongestWord {

	public String getLongestWord(String sentence) {
		if (sentence == "")
			return ("");

		String str = sentence.trim();
		String compareStr = "";
		String[] result = str.split(" ");
		String biggerStr = result[0];

		for (int idx = 0; idx < result.length - 1; idx++) {
			compareStr = biggerStr;
			if (compareStr.length() >= result[idx + 1].length())
				biggerStr = compareStr;
			else
				biggerStr = result[idx + 1];
		}
		return (biggerStr);
	}
}
