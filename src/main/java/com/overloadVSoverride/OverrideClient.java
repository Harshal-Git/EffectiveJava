/**
 * 
 */
package com.overloadVSoverride;

/**
 * @author hcharadva
 * -> The behavior similar to overloaded methods, is explained with overridden methods.
 * -> Overridden methods gets identified at run time.
 */
public class OverrideClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get all object arrays
		Wine [] wines= {new Wine(), new SparklingWine(), new Champagne()};

		// iterate over objects and call the respective method
		for(Wine wineObj : wines) {
			System.out.println(wineObj.getName());
		}
	}
}
