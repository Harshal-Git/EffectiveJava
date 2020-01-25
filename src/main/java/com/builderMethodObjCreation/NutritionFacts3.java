/**
 * 
 */
package com.builderMethodObjCreation;

/**
 * @author Harshal-Git
 * -> example of BuilderPattern - which should be eliminating the negative points from both previous attempts of object creation.
 */
public class NutritionFacts3 {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	// static inner class to provide build method 
	public static class Builder {
		
		// Required parameters
		private final int servingSize;
		private final int servings;
		
		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;
		
		// start point with mandatory parameters
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		/*
		 * for all optional parameters, it has returns statement - as this will allow the 
		 * chaining of optional parameters and keeps updating current object
		 */
		public Builder calories(int val) { 
			calories = val; 
			return this; 
		}
		
		public Builder fat(int val){ 
			fat = val; 
			return this; 
		}
		
		public Builder carbohydrate(int val){ 
			carbohydrate = val; 
			return this; 
		}
		
		public Builder sodium(int val) { 
			sodium = val; 
			return this; 
		}
		
		/**
		 * method to get an object at the end
		 */
		public NutritionFacts3 build() {
			return new NutritionFacts3(this);
		}
	}
	
	// private constructor of the actual class which never will be called by client
	private NutritionFacts3(Builder builder) {
		System.out.println("Builder pattern constructor ");
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
}