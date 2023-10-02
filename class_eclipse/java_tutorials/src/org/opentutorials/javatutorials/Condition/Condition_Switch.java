package org.opentutorials.javatutorials.Condition;

public class Condition_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Switch");
		Switch.sWitch();
		// switch 뒤의 괄호에 숫자 1이 주어지면, case 1에 해당하는 로직 이후의 모든 case들이 실행됨 
		
		System.out.println("\n2. Switch에 break 추가");
		Switch_Break.sWitch_Break();
		// break를 만나면, switch문의 실행이 즉시 중지된다. 이는 if문으로 변경 가능! 
		
		System.out.println("\n3. Switch에 default 추가");
		Switch_Default.sWitch_Default();
		// 즉, ** 주어진 케이스가 없는 경우 default문이 실행된다! 
}		

class Switch
{
	public static void sWitch()
	{
		System.out.println("Switch(1)");
		switch(1)
		{
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("switch(2)");
		switch(2)
		{
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
		
		System.out.println("Switch(3)");
		switch(3)
		{
		case 1:
			System.out.println("one");
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		}
	}

	}
}

class Switch_Break
{
	public static void sWitch_Break()
	{
		System.out.println("Switch(1)");
		switch(1)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		System.out.println("switch(2)");
		switch(2)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
		
		System.out.println("Switch(3)");
		switch(3)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		}
	}

}

class Switch_Default
{
	public static void sWitch_Default()
	{
		System.out.println("Switch(1)");
		switch(1)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default(1)");
			break;
		}
		
		System.out.println("switch(2)");
		switch(2)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default(2)");
			break;
		}
		
		System.out.println("Switch(3)");
		switch(3)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default :
			System.out.println("default(3)");
			break;
		}
		
		System.out.println("Switch(4)");
		switch(4)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default :
			System.out.println("default(4)");
			break;
		}
	}

}
