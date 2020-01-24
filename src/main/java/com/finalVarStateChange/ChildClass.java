/**
 * 
 */
package com.finalVarStateChange;

import java.util.Date;

/**
 * @author hcharadva
 *
 */
public class ChildClass extends SuperClass{

	private final Date date;
	
	public ChildClass() {
		System.out.println("ChildClass constructor called...");
		date= new Date();
	}
	
	@Override
	public void overrideMe() {
		System.out.println("Date in child class : "+date);
	}
}
