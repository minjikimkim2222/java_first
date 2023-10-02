package org.opentutorials.javatutorials.Type_Conversion;

public class Type_Conversion {

	public static void main(String[] args) {
		// 1. 자동(암시적) 형 변환 
		double a = 3.4F;
			// 타입을 변경해도, 정보의 손실이 일어나지 않는 경우, 자동 형변환이 일어남
			// float -> double; 즉, 작은 타입 -> 큰 타입으로는 자동 형변환
			
			/*
			 반대로,
			 float a = 3.4;
			 이건 에러. 
			 왜냐, 상수 3.4는 double형인데, float에 넣으려고 하기에,
			 즉, 큰 타입 -> 작은 타입으로의 형변환은 오류 발생!
			 */
		// 자동 형변환의 원칙은,표현범위가 좁은 데이터타입 -> 넓은 데이터타입으로의 변환만 허용 
		
		int a2 = 3;
		float b = 1.0F;
		double c = a2 + b;
			// 2번의 형변환. int형 a2 -> float형으로, float형인 연산결과가 double형으로 형 변환!
		
		// 2. 명시적 형변환  -> 자동 형 변환이 적용되지 않는 경우, 수동 형 변환
		float A = (float)100.0;
		int B = (int)100.0F;
		System.out.println("A : " + A + " B : " + B);
	}	
}