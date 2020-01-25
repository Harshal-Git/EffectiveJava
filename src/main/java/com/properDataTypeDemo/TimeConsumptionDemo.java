/**
 * 
 */
package com.properDataTypeDemo;

import java.util.Date;

/**
 * @author Harshal-Git
 * -> How to unnecessary initialization of Wrapper object can be expensive is explained in this code.
 * 
 * -> Make the "total" variable as Long wrapper class; it will take longer time compared to primitive long. 
 */
public class TimeConsumptionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Non compliant code : Unnecessary wrapper objects should be avoided (took 7 seconds)
		 */
		//Long total= 0L;
		
		/*
		 * Compliant code: primitive variables are faster to process (took 0 seconds)
		 */
		long total= 0L;
		
		long startTime= new Date().getTime();
		System.out.println("Counting started from 0 to MAX_VAL... wait");
		
		for(long index= 0; index <= Integer.MAX_VALUE ; index++) {
			total+= index;
		}
		long endTime= new Date().getTime();
		System.out.println("Counting ended...");
		System.out.println("Total time taken: "+((endTime- startTime)/1000)+" s. -> Total: "+total);
	}

}
