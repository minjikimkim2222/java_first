package org.opentutorials.javatutorials.conditional_operator;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("add 연산자 결과");
		AddOperator();

		System.out.println("\nOr 연산자 결과");
		OrOperator();

		System.out.println("\nNot 연산자 결과");
		NotOperator();
		
			

	}
	
	public static void AddOperator()
	{
		if (true && true)
			System.out.println(1);
		
		if (true && false)
			System.out.println(2);
		
		if (false && true)
			System.out.println(3);
	
		if (false && false)
			System.out.println(4);
			
	}

	public static void OrOperator()
	{
		if (true || true)
			System.out.println(1);
		
		if (true || false)
			System.out.println(2);
		
		if (false || true)
			System.out.println(3);
		
		if (false || false)
			System.out.println(4);
	}
	
	public static void NotOperator()
	{
		if (!true)
			System.out.println(1);
		
		if (!false)
			System.out.println(2);
	}
	
}
