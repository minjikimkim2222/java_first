package org.opentutorials.javatutorials.Operator;

import static java.lang.System.out; // c++의 namespace와 비슷한 기능을 하는 java - import

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("산술연산자 결과");
		ArithmeticDemo.ArithmeticFunc();
		
		System.out.println("remainder 결과");
		Remainder.remainder();
		
		System.out.println("타입별 division 결과");
		DivisionByType.Division_By_Type();
		
		System.out.println("단항 연산자 결과");
		PrePost.PrePostFunc();

	}

}

class ArithmeticDemo
{
	public static void ArithmeticFunc()
	{
		int result = 1 + 2;
		System.out.println(result); // 3
		
		result = result - 1;
		System.out.println(result); // 2
		
		result = result * 2;
		System.out.println(result); // 4
		
		result = result / 2; 
		System.out.println(result); // 2
		
		result = result + 8;
		System.out.println(result); // 10
		
		result = result % 7;
		System.out.println(result); // 3
	}
}

class Remainder
{
	public static void remainder()
	{
		int a = 3;
		System.out.println(0 % a); // 0
		System.out.println(1 % a); // 1
		System.out.println(2 % a); // 2
		System.out.println(3 % a); // 0
		System.out.println(4 % a); // 1
	}
}


class DivisionByType
{
	public static void Division_By_Type()
	{
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		out.println(a / b); // 3
		out.println(c / d); // 3.3333333
		out.println(a / d); // 암시적인 형변환 이후, 실수로 결과값이 나타남. 3.3333333
	}
}

class PrePost
{
	public static void PrePostFunc()
	{
		int i = 3;
		i++;
		System.out.println(i); // 4
		++i;
		System.out.println(i); // 5
		
		System.out.println(++i); // 6
		System.out.println(i++); // 6 <<
		System.out.println(i); // 7
		
		/*
		  ++i는 i의 값에 1이 더해진 값을 출력하는 것이고,
		  i++는 이것이 속해있는 println에 일단 현재 i의 값을 출력하고, 
		  println의 실행이 끝난 후에 i의 값이 증가하는 특성
		 */
	}
}
