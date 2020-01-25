/**
 * 
 */
package com.overloadVSoverride;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Harshal-Git
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
