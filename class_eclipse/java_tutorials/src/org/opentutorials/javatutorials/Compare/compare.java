package org.opentutorials.javatutorials.Compare;

/*
 비교 연산자 -> 같은지, 다른지, 큰지, 작은지
 비교 연산자의 결과 -> true, false
 */

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("Equal 결과");
		Equal();
		
		System.out.println("\nNotEquual 결과");
		NotEqual();
		
		System.out.println("\nGreaterThan 결과");
		GreaterThan();
		
		System.out.println("\nGreaterThanOrEqual 결과");
		GreaterThanOrEqual();
		
		System.out.println("\nEqualString 결과");
		EqualString();
	}
	
	public static void Equal()
	{
		System.out.println(1 == 2); // false
		System.out.println(1 == 1); // true
		System.out.println("one" == "two"); // false
		System.out.println("is it true?" == "is it true?"); // true
	}
	
	public static void NotEqual()
	{
		System.out.println(1 != 2); // true
		System.out.println(1 != 1); // false
		System.out.println("one" != "two"); // true
	}
	
	public static void GreaterThan()
	{
		System.out.println(10 > 20); // false
		System.out.println(10 > 10); // false
		System.out.println(10 > 2); // true
	}
	
	public static void GreaterThanOrEqual()
	{
		System.out.println(10 >= 20); // false
		System.out.println(10 >= 2); // true
		System.out.println(10 >= 10); // true
	}
	
	public static void EqualString()
	{
		String a = "Hello world";
		String b = new String("Hello world");
		
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true, 문자열 'a'와 'b'의 실제 내용이 동일한지 체크 
		
	}
}