/**
 * 
 */
package com.cloneTest;

import java.util.Arrays;

/**
 * @author hcharadva
 *
 */
public class ArrayClass implements Cloneable{

	public int data[]= new int[5];
	
	public ArrayClass() {
		for(int i= 0; i < 4; i++) {
			data[i]= i*2;
		}
		System.out.println("Constructor called...");
	}
	
	public String getData() {
		return Arrays.toString(data);
	}
		
	@Override
	protected ArrayClass clone() throws CloneNotSupportedException {
		/*
		 * Non compliant code: This method perform shallow copy- internal components are still shared between original and cloned object (if any)  
		 */
		//return shallowClone();
		
		/*
		 * Compliant code: Provides a deep clone internal members also should be copied.
		 */
		return deepClone();
	}

	private ArrayClass shallowClone() throws CloneNotSupportedException {
		return (ArrayClass) super.clone();
	}

	private ArrayClass deepClone() throws CloneNotSupportedException {
		ArrayClass cloneObj= (ArrayClass) super.clone();
		cloneObj.data= this.data.clone();
		return cloneObj;
	}
}
