/**
 * 
 */
package com.compareToEqualsTest;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Harshal-Git
 */
public class CompareToClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 2 different BigDecimal objects
		BigDecimal obj1= new BigDecimal("1.0");
		BigDecimal obj2= new BigDecimal("1.00");
		
		System.out.println("obj1 = new BigDecimal(\"1.0\")");
		System.out.println("obj2 = new BigDecimal(\"1.00\")");
		
		// check whether these objects  are same OR not ?
		System.out.println("obj1.equals(obj2) ? "+obj1.equals(obj2));
		
		// add these objects in HashSet - will be added as 2 different objects
		Set<BigDecimal> hashsetObj= new HashSet<>();
		hashsetObj.add(obj1);hashsetObj.add(obj2);
		System.out.println("Objects inserted into hash set: "+hashsetObj.toString());
		
		// add these objects in a TreeSet - will be added as one 
		Set<BigDecimal> treeSetObj= new TreeSet<>();
		treeSetObj.add(obj1);treeSetObj.add(obj2);
		System.out.println("Objects inserted into tree set: "+treeSetObj.toString());
		
		/*
		 * Same test with other sorted collection will also behave in the same manner when above objects are used for insertion.
		 * 
		 * -> SortedSet / TreeSet, SortedMap / TreeMap 
		 */
		
		/*Map<BigDecimal, String> hashMapObj= new HashMap<>();
		hashMapObj.put(obj1, "ABC");hashMapObj.put(obj2, "PQR");
		System.out.println("HashMap data: "+hashMapObj.toString());
		
		Map<BigDecimal, String> treeMapObj= new TreeMap<>();
		treeMapObj.put(obj1, "ABC");treeMapObj.put(obj2, "PQR");
		System.out.println("TreeMap data: "+treeMapObj.toString());*/
	}
}
