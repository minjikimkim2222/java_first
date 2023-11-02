package com.in28minutes.introduction;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);

//		ducati.start();
//		honda.start();
//
//		ducati.setSpeed(100);
//		ducati.getSpeed();
//		honda.setSpeed(200);
//		honda.getSpeed();
//
//
//		ducati.increaseSpeed(40);
//		honda.increaseSpeed(70);
//
//		ducati.decreaseSpeed(40);
//		honda.decreaseSpeed(70);

		System.out.println(ducati.getSpeed()); // 100
		System.out.println(honda.getSpeed()); // 200

		// 각각의 객체 ducati와 honda는 독립적인 공간을 가져, 서로 침범하지 않는다.
	}

}
