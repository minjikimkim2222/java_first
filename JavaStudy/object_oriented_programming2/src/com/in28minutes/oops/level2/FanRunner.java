package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		String name = "fan1";
		double radius = 10.2;
		String color = "yellow";

		Fan fan = new Fan(name, radius, color);
		System.out.println(fan);
		/*
		 * java -> System.out.println() 메서드는 객체의 클래스에 오버라이드된 toString() 함수를 자동으로 호출한다.
		 * 만일, 오버이드되지 않았다면, Object 클래스의 기본 toString() 메서드가 호출되어, 객체의 클래스 이름과 해시코드를 문자열로
		 * 변환해 반환한다.
		 */
		fan.switchOff();
		System.out.println(fan);

		fan.changeSpeed(90);
		System.out.println(fan);
	}

}
