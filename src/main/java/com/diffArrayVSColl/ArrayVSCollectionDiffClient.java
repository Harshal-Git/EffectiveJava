/**
 * 
 */
package com.diffArrayVSColl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcharadva
 */
public class ArrayVSCollectionDiffClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Object[] objArray= new Integer[5];
		
		System.out.println("Declared object array...");
		
		System.out.println("Put string data...");
		objArray[0]= "This is string";
		
		/*
		 * This type of declaration with collection is not possible - compilation issue
		 */
		//List<Object> objList= new ArrayList<Integer>();
	}
}