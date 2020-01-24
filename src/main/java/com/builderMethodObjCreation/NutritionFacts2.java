/**
 * 
 */
package com.builderMethodObjCreation;

/**
 * @author hcharadva
 * -> example of JavaBeans constructor approach
 */
public class NutritionFacts2 {

	// Parameters initialized to default values (if any)
	private int servingSize = -1; // Required; no default value
	private int servings = -1; // Required; no default value
	private int calories = 0;   // optional 
	private int fat = 0; // (g) optional
	private int sodium = 0; // (mg) optional
	private int carbohydrate = 0; // (g) optional
	
	public NutritionFacts2() { 
		System.out.println("Java beans approached constructor");
	}

	// Setter methods
	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
}
