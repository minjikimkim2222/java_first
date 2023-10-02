package org.opentutorials.javatutorials.Condition;

import java.util.Scanner; // C의 scanf에 대응되는 java - input
/*
 앞서 배운 불린은 조건문에서 핵심적인 역할을 담당하는데, 이 불린 값을 기준으로 실행흐름을 제어한다.
 */
public class condition {

	public static void main(String[] args) {
		// Condition1,2는 if문 
		Condition1();
		
		Condition2();
		
		// Condition3 : if - else문 
		Condition3();
		
		// Condition4 : if - else if - else문
		Condition4();
		
		// 지금까지 배운 변수, 비교연산자, 조건문을 이용한 작은 프로그램, Login() 함수!
		System.out.println("Login input");
		
		Scanner scanner = new Scanner(System.in); // Scanner클래스로 키보드 입력 
		String id = scanner.nextLine(); // nextLine()메서드로 입력받은 문자열값을 id 변수에 저장 
		

		Login.LoginFunc(id);
		
		int idx = 0;
		while (idx++ != 3)
		{
		// 아이디와 비밀번호 모두 검증하는 예제, 반복문의 중첩
		System.out.println("LoginFull input");
		
		Scanner scanner2 = new Scanner(System.in);
		String id2 = scanner2.nextLine();
		
		System.out.println("LoginFull password");
		Scanner scanner3 = new Scanner(System.in);
		String password = scanner3.nextLine();
		
		Login2.LoginFull(id2, password);
		}
		
	}
	
	public static void Condition1()
	{
		if (true)
			System.out.println("result : true");
		if (false)
			System.out.println("result : false");
	}
	
	public static void Condition2()
	{
		if (true)
		{
			for (int i = 0; i < 5; )
				System.out.println(2*++i +1); // 3 5 7 9 11
		}
		
		if(false){
			System.out.println(1);
		    System.out.println(2);
		    System.out.println(3);
		    System.out.println(4);
		}
		System.out.println(5); // 5만 출력
	}
	
	public static void Condition3()
	{
		if (true)
			System.out.println(1);
		else
			System.out.println(2); // 1 출력
		
		if (false)
			System.out.println(1);
		else
			System.out.println(2); // 2 출력 
	}

	public static void Condition4()
	{
		if (false)
			System.out.println(1);
		else if (true)
			System.out.println(2);
		else if (true)
			System.out.println(3);
		else
			System.out.println(4);
		// 하나라도 만족하는 순간, 이 조건문을 빠져나가기에, 결과는 2!!
	}
}

class Login
{
	public static void LoginFunc(String input)
	{
		String id = input;
		
		if (id.equals("minjiki2"))
			System.out.println("right");
		else
			System.out.println("wrong");
		/*
		 문자열을 id == "minjiki2"로 비교하면, 문자열의 실제 내용이 아닌 문자열의 메모리주소를 비교하므로, 
		 기대와는 다른 결과를 얻게 된다.
		 따라서, equals 메서드를 사용해야 한다!
		 * 
		 */
	}
}

class Login2
{
	public static void LoginFull(String input1, String input2)
	{
		String id = input1;
		String password = input2;
		
		if (id.equals("minjiki2"))
		{
			if (password.equals("0101"))
				System.out.println("id and password is right");
			else
				System.out.println("password is wrong");
		}
		else
			System.out.println("id is wrong");
		
		
	}
}
