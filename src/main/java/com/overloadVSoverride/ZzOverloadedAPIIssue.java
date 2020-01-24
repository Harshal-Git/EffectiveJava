/**
 * 
 */
package com.overloadVSoverride;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author hcharadva
 * 
 * -> This program is to show case how overload can create problem which is existing in Java API of list remove.
 * 
 * -> For this program; initially we are inserting 6 values in tree set and a list : form -3 to 2
 * 
 *  -> Once inserted; we are calling remove methods on both collections.
 *  
 *  -> The remove() for set- will behave properly where it will remove the elements from the positions: 4 to 6
 *  -> But remove() for list - will behave very weirdly.
 *  
 *  -> THE remove() METHOD FOR LIST IS OVERLOADED WITH 2 VERSIONS.
 *  -> One accepts an "int" argument and removes the element from that given "int" index
 *  -> Another method accepts an "Object" and it will remove the given object from complete collection.
 *  
 *  -> That's why if we want results as set; we need to manually cast the given index into wrapper object to get the result same as set. 
 */
public class ZzOverloadedAPIIssue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}

		for (int i = 0; i < 3; i++) {
			
			/*
			 * Remove from set (See API)
			 * It will auto-box the given value and ultimately it will remove the object
			 */
			set.remove(i);

			/*
			 * Remove from list - this will behave as removing from given index
			 * Non compliant code (with set operation above)
			 */
			list.remove(i);

			/*
			 * Remove from list - this will actually remove the given object
			 * Compliant code (with set operation above)
			 */
			//list.remove(new Integer(i));
		}
		System.out.println("Set -> "+set); 
		System.out.println("List -> "+list);
	}
}
