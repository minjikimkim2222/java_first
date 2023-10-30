package coms.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiNumber nums = new BiNumber(2, 3);

		System.out.println(nums.add()); // 5
		System.out.println(nums.multiply()); // 6
		nums.doubleNums(); // 4, 6
		System.out.println(nums.getNumber1()); // 4
		System.out.println(nums.getNumber2()); // 6
	}

}
