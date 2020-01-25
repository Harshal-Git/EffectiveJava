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
