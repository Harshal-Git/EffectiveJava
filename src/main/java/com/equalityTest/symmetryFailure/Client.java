/**
 * 
 */
package com.equalityTest.symmetryFailure;

/**
 * @author Harshal-Git
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CaseInsensitiveString str1= new CaseInsensitiveString("Polish");
		
		String str2= "polish";
		
		CaseInsensitiveString str3= new CaseInsensitiveString("Polish");
		
		/*
		 * If all object comparison returns same values (true/false)- then only the symmetry contract is supposed to be fulfilled.
		 * Change the equals() behavior in "CaseInsensitiveString.java" and see the difference.
		 */
		System.out.println("Symmetry - ?");
		System.out.println("str1== str2? : "+(str1.equals(str2)));
		System.out.println("str2== str1? : "+(str2.equals(str1)));
		System.out.println("str1== str3? : "+(str1.equals(str3)));
		System.out.println("str3== str1? : "+(str3.equals(str1)));
	}
}
