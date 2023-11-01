package com.in28minutes.loops;

public class calculateLCMRunner {

	public static void main(String[] args) {
		calculateLCM LCM = new calculateLCM(9, 6);

		int result = LCM.getLCM();
		System.out.println("LCM " + result);

	}

}
