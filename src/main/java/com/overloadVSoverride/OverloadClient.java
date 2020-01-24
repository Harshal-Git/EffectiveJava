/**
 * 
 */
package com.overloadVSoverride;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author hcharadva
 * 
 * -> In this program, we are putting different types of concrete collection implementation objects into a Collection array and trying to identify that concrete
 * 		implementation class type. 
 * 
 * -> For all three iterations of the classify() method loop, the compile-time type of the parameter is the same: Collection<?>. The runtime type is 
 * different in each iteration, but this does not affect the choice of overloading. Because the compile-time type of the parameter is Collection<?>, 
 * the only applicable overloading is the third one, classify(Collection<?>), and this overloading is invoked in each iteration of the loop.
 * 
 * -> To overcome this, the option "instanceOf" check is given. Considering that, no further method override is needed.
 */
public class OverloadClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Collection<?>[] collections = {new HashSet<String>(), new ArrayList<BigInteger>(), new HashMap<String, String>().values() };

		System.out.println("Identification with overloaded methods...");
		for (Collection<?> c : collections) {
			System.out.println(classify(c));
		}

		System.out.println("Identification with single method with instanceOf check...");
		for (Collection<?> c : collections) {
			System.out.println(classifyTest(c));
		}

	}

	/*
	 *  Non compliant code: Overloaded methods
	 */
	// for set
	public static String classify(Set<?> s) {
		return "Set";
	}
	// for list
	public static String classify(List<?> lst) {
		return "List";
	}
	// for collection
	public static String classify(Collection<?> c) {
		return "Unknown Collection";
	}

	/*
	 * Compliant solution: ignore all overloaded methods and make a single method to have instanceOf testing for the given collection arrays
	 */
	public static String classifyTest(Collection<?> coll) {
		if(coll instanceof Set<?>) {
			return "Set";
		}
		else if(coll instanceof List<?>) {
			return "List";
		}
		else {
			return "Unknown Collection";
		}
	}
}
