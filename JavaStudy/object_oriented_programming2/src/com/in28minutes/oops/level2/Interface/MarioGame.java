package com.in28minutes.oops.level2.Interface;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");

	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Goes into a hole");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Go Forwards");
	}

}
