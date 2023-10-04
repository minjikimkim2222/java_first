package org.opentutorials.javatutorials.loop;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("While loop ");
//		WhileLoop();
//
//		System.out.println("\nFor loop");
//		ForLoop();
//		
//		System.out.println("\nbreak문 결과");
//		Break();
//		
//		System.out.println("\ncontinue문 결과");
//		Continue();
		
		System.out.println("\n중첩 반복문 결과 ");
		LoopAndLoop();
	}
	
	public static void WhileLoop()
	{
		// while문은 무한반복 재귀에 빠지지 않도록 주의하자!
		int i = 0;
		
		while (i < 10)
		{
			System.out.println("java coding " + i);
			i++;
		}
	}
	
	public static void ForLoop()
	{
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}
	
	public static void Break()
	{
		for (int i = 0; i < 10; i++)
		{
			if (i == 5)
				break; // break문은 반복문을 즉시 종료시킨다. 
			System.out.println("break, i : " + i );
		}
	}
	
	public static void Continue()
	{
		for (int i = 0; i < 10; i++)
		{
			if (i == 5)
				continue; // i == 5일 때 이 명령 이후의 로직을 실행하지 않는다.
			//다만, 반복문 자체를 중단하지 않는다. 
			System.out.println("continue, i : " + i );
		}
	}
	
	public static void LoopAndLoop()
	{
		// 00, 01, 02, ..., 99까지 출력
		for (int i = 0; i < 10; i++)
		{
			for (int j = 0; j < 10; j++)
				System.out.println(i + "" + j);
			// 숫자와 문자열을 '+' 연산자로 결합해, -> 문자열로 변환해 이어붙인다 
			
		}
	}

}
