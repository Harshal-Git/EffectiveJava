/**
 * 
 */
package com.finalVarStateChange;

/**
 * @author hcharadva
 *
 */
public class SuperClass {
	
	public SuperClass() {
		System.out.println("SuperClass class constructor called...");
		overrideMe();
	}
	
	// empty method - which should be overridden by subclass
	public void overrideMe() { 	}
}
