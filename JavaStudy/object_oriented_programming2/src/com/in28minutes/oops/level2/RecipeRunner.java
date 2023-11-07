package com.in28minutes.oops.level2;

public class RecipeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipe1 recipe1 = new Recipe1();
		AbstractRecipe recipe2 = new Recipe1();

//		recipe1.getReady();
//		recipe2.getReady();
//
//		recipe1.doTheDish();
//		recipe2.doTheDish();
//
//		recipe1.cleanup();
//		recipe2.cleanup();

		recipe1.execute();

		RecipeWithMicrowave recipeWithMicroWave = new RecipeWithMicrowave();

		recipeWithMicroWave.execute();
	}

}
