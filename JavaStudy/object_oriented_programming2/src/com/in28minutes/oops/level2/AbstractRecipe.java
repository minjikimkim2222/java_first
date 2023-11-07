package com.in28minutes.oops.level2;

public abstract class AbstractRecipe {
	public void execute() {
		getReady(); // prepare
		doTheDish(); // recipe
		cleanup(); // cleanup
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
}
