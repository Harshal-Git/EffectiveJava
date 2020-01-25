/**
 * 
 */
package com.properDataTypeDemo;

import java.math.BigDecimal;

/**
 * @author hcharadva
 *  
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
