/**
 * 
 */
package com.defensiveCopyDemo;

import java.util.Date;

/**
 * @author Harshal-Git
 * 
 * -> To demonstrate how clients can change the state of object which may cause incorrect results.
 * 
 * -> Check inside "PeriodClass.java" class and observe the difference in results by putting Non compliant code blocks
 * 		 and compliant code blocks alternatively in action.
 */
public class PeriodClient {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		// gap for thread sleep in ms
		int gap= 5000;

		// start time
		Date start = new Date();
		System.out.println("Start datetime set... wait to finish");

		// just to pass some seconds to get a new time
		Thread.sleep(gap);

		// end time (after 5 seconds)
		Date end = new Date();
		System.out.println("End datetime set...");

		PeriodClass period= new PeriodClass(start, end);

		/*
		 * DO NOT REMOVE THESE STATEMENTS
		 * This statement will break the class "PeriodClass" which is supposed to be immutable.
		 * As the start and end date are directly passed to class constructor; once the constructor is called; and the parameter objects are updated somehow..
		 * those inner class members are also updated (pass by value). So by the time we calculate the actual result, it will print wrong data.
		 */
		end.setYear(78);
		period.getEnd().setYear(78);
		
		// supposed to print "gap" seconds approximately.. but it will print something else - with older representation
		period.printDiff();
	}
}
