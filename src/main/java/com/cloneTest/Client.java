/**
 * 
 */
package com.cloneTest;

/**
 * @author hcharadva
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
