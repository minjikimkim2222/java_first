package coms.in28minutes.primitive.datatypes;

public class StringMagicRunner {

	public static void main(String[] args) {

		StringMagic stringMagic = new StringMagic();

		String str = "6months";
		int resultInt = stringMagic.getRightmostDigit(str);
		System.out.println("result int : " + resultInt);
	}

}
