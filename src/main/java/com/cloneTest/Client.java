/**
 * 
 */
package com.cloneTest;

/**
 * @author hcharadva
 * 
 * -> This is an example of shallow copy via clone() method. After cloning it will refer to the same data from original object.
 * 		Hence if you modify the data via cloned object, it will be reflected in actual object.
 * 
 * -> So need to take care of inner components inside the overridden clone() method 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayClass actualObj= new ArrayClass();
		ArrayClass cloned= null;
		
		try {
			cloned= actualObj.clone();
		} 
		catch (CloneNotSupportedException e) {
			System.out.println("Clone not supported: "+e.getMessage());
		}
		System.out.println("Actual object data: "+actualObj.getData());
		System.out.println("Clone object data: "+cloned.getData());
		
		// set data in clone object
		cloned.data[4]= 22;
		
		// get data from actual object
		System.out.println("Actual object data @ 4th position after set: "+actualObj.data[4]);
		System.out.println("Cloned object data @ 4th position after set: "+cloned.data[4]);
	}

}
