package com.in28minutes.oops.level2.Interface;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MarioGame marioGame = new MarioGame();
//
//		marioGame.up();
//		marioGame.down();
//		marioGame.left();
//		marioGame.right();

		GamingConsole game = new MarioGame();
//		GamingConsole game = new ChessGame();

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
