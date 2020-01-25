/**
 * 
 */
package com.defensiveCopyDemo;

import java.util.Date;

/**
 * @author Harshal-Git
 */
public class PeriodClass {

	private Date start;
	private Date end;

	/*
	 * Access modifiers of the getter methods are intentionally kept public. 
	 * If we make it private; this class can be saved by external modifications.
	 * 
	 * But because those are public; these classes are still mutable. 
	 * Hence while providing any type of getter method should also consider to make the defensive copies.
	 */
	public Date getStart() {
		/*
		 * Non compliant code: this state can be changed by client
		 */
		//return start;

		/*
		 * Compliant code: safe to return
		 */
		return new Date(this.start.getTime());
	}

	public Date getEnd() {
		/*
		 * Non compliant code: this state can be changed by client
		 */
		//return end;

		/*
		 * Compliant code: safe to return
		 */
		return new Date(this.end.getTime());
	}

	private void setStart(Date date) {
		this.start= date;
	}

	private void setEnd(Date date) {
		this.end= date;
	}

	/*
	 * Public constructor
	 */
	public PeriodClass(Date startDate, Date endDate) {

		// regular data check
		if(startDate== null || endDate== null) {
			throw new NullPointerException("Null constructor arguments.");
		}
		if(!startDate.before(endDate)) {
			throw new IllegalArgumentException("Start date should be before End date.");
		}

		/*
		 * Non compliant code: the assignments which will make this class prone to changes and populate wrong results
		 */
		/*this.start= startDate;
		this.end= endDate;*/

		/*
		 * Compliant code:  The arguments should be made as defensive copies. Hence any change at client side will 
		 * not affect the actual object being used.
		 */
		setStart(new Date(startDate.getTime()));
		setEnd(new Date(endDate.getTime()));
	}

	// print difference between end and start time
	public void printDiff() {
		System.out.println("Difference between start and end datetime : "+((getEnd().getTime()-getStart().getTime())/1000)+" s.");
	}
}
