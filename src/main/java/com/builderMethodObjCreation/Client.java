/**
 * 
 */
package com.builderMethodObjCreation;

/**
 * @author Harshal-Git
 * -> This is to show how the constructor can be made based on need.
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// client for telescope constructors
		NutritionFacts1 cocaCola = new NutritionFacts1(240, 8, 100, 0, 35, 27);
		
		// client for JavaBeans approach
		NutritionFacts2 sprite = new NutritionFacts2();
		sprite.setServingSize(240);
		sprite.setServings(8);
		sprite.setCalories(100);
		sprite.setSodium(35);
		sprite.setCarbohydrate(27);
		
		/*
		 * client for Builder pattern
		 * this simulates named optional parameter as found in Python / Ada
		 */
		//NutritionFacts3 fanta1= new NutritionFacts3.Builder(400, 10).build();
		
		NutritionFacts3 fanta2= new NutritionFacts3.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
	}

}
