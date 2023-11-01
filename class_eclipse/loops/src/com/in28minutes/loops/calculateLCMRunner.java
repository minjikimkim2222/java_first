package com.in28minutes.loops;

public class calculateLCMRunner {

	public static void main(String[] args) {
		calculateLCM LCM = new calculateLCM(6, 8);

		int result = LCM.getLCM();
		System.out.println("LCM " + result);

	}

}
