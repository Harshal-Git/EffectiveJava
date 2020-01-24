/**
 * 
 */
package com.properDataTypeDemo;

import java.math.BigDecimal;

/**
 * @author hcharadva
 * 
 * Suppose you have a dollar in your pocket, and you see a shelf with a row of delicious candies priced at 10¢, 20¢, 30¢, and so forth, up to a dollar. 
 * You buy one of each candy, starting with the one that costs 10¢, until you can’t afford to buy the next candy on the shelf. 
 * How many candies do you buy, and how much change do you get?
 * 
 * This program will show the inconsistency to solve monetary problems using float. This type of calculation should be done with BigDecimal / int / long. 
 */
public class MonetaryDatatypeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		calculateWithFloat();
		calculateWithBigDecimal();
	}

	private static void calculateWithBigDecimal() {
		System.out.println("BigDecimal results...");
		final BigDecimal TEN_CENTS = new BigDecimal(".10");
		int itemsBought = 0;
		BigDecimal funds = new BigDecimal("1.00");
		for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
			itemsBought++;
			funds = funds.subtract(price);
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Money left over: $" + funds);
	}

	private static void calculateWithFloat() {
		System.out.println("Float results...");
		double funds = 1.00;
		int itemsBought = 0;
		for (double price = .10; funds >= price; price += .10) {
			funds -= price;
			itemsBought++;
		}
		System.out.println(itemsBought + " items bought.");
		System.out.println("Change: $" + funds);
	}
}
