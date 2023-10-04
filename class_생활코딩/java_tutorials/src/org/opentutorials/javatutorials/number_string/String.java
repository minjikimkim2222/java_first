package org.opentutorials.javatutorials.number_string;

public class String {

	public static void main(java.lang.String[] args) {
		
		// 문자('a')와 문자열("a")
		System.out.println('생');
		System.out.println("생활코딩");
		
		/* 
		 	System.out.println('생활'); 
		 	문자열을 작은 따옴표로 감싸면 에러가 발생한다.
		 */
		System.out.println("생");
		// 한 글자도 문자열이 될 수 있기 때문에, 하나의 글자를 큰 따옴표로 감싸도 에러 발생하지 않는다.
		
		// 이스케이프 문자
		System.out.println("\" < 큰 따옴표 출력되나요?");
		System.out.println("개행\n되는지 체\n크");
		
		// 문자의 연산    
		System.out.println("생활" + "코딩");
		System.out.println("자바 \n 공부하자 ! \n");
	}

}
