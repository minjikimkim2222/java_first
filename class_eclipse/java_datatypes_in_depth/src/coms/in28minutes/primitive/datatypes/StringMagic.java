package coms.in28minutes.primitive.datatypes;

public class StringMagic {

	public int getRightmostDigit(String str) {

		int lastStringIdx = str.length() - 1;
		int retInt = 0;
		char ch;

		for (int idx = lastStringIdx; idx >= 0; idx--) {

			ch = str.charAt(idx);

			if (Character.isDigit(ch)) {
				retInt = Character.getNumericValue(ch);
				return (retInt);
			}
		}
		return (-1);
	}
}
