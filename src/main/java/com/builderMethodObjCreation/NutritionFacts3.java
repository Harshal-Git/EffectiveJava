/**
 * 
 */
package com.builderMethodObjCreation;

/**
 * @author Harshal-Git
 * -> example of BuilderPattern - which should be eliminating the negative points from both previous attempts of object creation.
 */
public class NutritionFacts3 {

	private int servingSize;
	private int servings;
	private int calories;
	private int fat;
	private int sodium;
	private int carbohydrate;

	// static inner class to provide build method 
	public static class Builder {
		
		// Required parameters
		private final int servSize;
		private final int serving;
		
		// Optional parameters - initialized to default values
		private int cal = 0;
		private int fatContent = 0;
		private int carbs = 0;
		private int sodiumLevel = 0;
		
		// start point with mandatory parameters
		public Builder(int servingSize, int servings) {
			this.servSize = servingSize;
			this.serving = servings;
		}
		
		/*
		 * for all optional parameters, it has returns statement - as this will allow the 
		 * chaining of optional parameters and keeps updating current object
		 */
		public Builder calories(int val) { 
			cal = val; 
			return this; 
		}
		
		public Builder fat(int val){ 
			fatContent = val; 
			return this; 
		}
		
		public Builder carbohydrate(int val){ 
			carbs = val; 
			return this; 
		}
		
		public Builder sodium(int val) { 
			sodiumLevel = val; 
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
		setServingSize(builder.servSize);
		setServings(builder.serving);
		setCalories(builder.cal);
		setFat(builder.fatContent);
		setSodium(builder.sodiumLevel);
		setCarbohydrate(builder.carbs);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder= new StringBuilder();
		builder.append(getServingSize()).append("-").append(getServings()).append("-").append(getCalories()).append("-").
			append(getFat()).append("-").append(getSodium()).append("-").append(getCarbohydrate());
		return builder.toString();
	}
	
	/**
	 * @return the servingSize
	 */
	public int getServingSize() {
		return servingSize;
	}

	/**
	 * @param servingSize the servingSize to set
	 */
	private void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	/**
	 * @return the servings
	 */
	public int getServings() {
		return servings;
	}

	/**
	 * @param servings the servings to set
	 */
	private void setServings(int servings) {
		this.servings = servings;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	private void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * @return the fat
	 */
	public int getFat() {
		return fat;
	}

	/**
	 * @param fat the fat to set
	 */
	private void setFat(int fat) {
		this.fat = fat;
	}

	/**
	 * @return the sodium
	 */
	public int getSodium() {
		return sodium;
	}

	/**
	 * @param sodium the sodium to set
	 */
	private void setSodium(int sodium) {
		this.sodium = sodium;
	}

	/**
	 * @return the carbohydrate
	 */
	public int getCarbohydrate() {
		return carbohydrate;
	}

	/**
	 * @param carbohydrate the carbohydrate to set
	 */
	private void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
}