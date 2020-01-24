/**
 * 
 */
package com.equalityTest.symmetryFailure;

/**
 * @author hcharadva
 * 
 * -> This class is used as an example to show how symmetry contract can be breached with improper implementation of overridden equals() method.
 * -> Active the alternate behavior and see the result difference.
 */
public class CaseInsensitiveString {

	private final String s;

	public CaseInsensitiveString(String data) {
		if(data== null) {
			throw new NullPointerException();
		}
		this.s= data;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * Non compliant code: Attempt to include the same behavior from "String" class to make this class relevant may break symmetry contract.
		 */
		return nonCompliantCode(obj);

		/*
		 *Compliant code: Only behavior of current class - which keeps the symmetry contract unbroken
		 */
		//return compliantCode(obj);
	}

	private boolean nonCompliantCode(Object obj) {
		if(obj instanceof String) {
			return this.s.equalsIgnoreCase((String)obj);
		}
		if(obj instanceof CaseInsensitiveString) {
			return ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
		}
		return false;
	}

	private boolean compliantCode(Object obj) {
		if(obj instanceof CaseInsensitiveString) {
			return ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
		}
		return false;
	}
}
