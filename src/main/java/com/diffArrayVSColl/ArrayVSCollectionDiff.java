/**
 * 
 */
package com.diffArrayVSColl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcharadva
 * 
 * -> This code shows that the Array (of Primitive type) can accept it's subtypes.
 * 
 * -> Arrays are Reified - means it will identify and enforce the data type at runtime while reading data from it. 
 * 
 * -> That is not the same case with Collection with Generics. It cannot accept subtypes.
 * 
 * -> Generics (with Collection) are erasure - which means identification and enforcement will be done at compile time itself. So type check is 
 * 		much stricter with Generics. 
 * 
 *  -> Because of this, Array might give ArrayStoreException while putting the data. 
 */
public class ArrayVSCollectionDiff {

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