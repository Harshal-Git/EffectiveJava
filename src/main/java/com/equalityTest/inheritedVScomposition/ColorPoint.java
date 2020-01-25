/**
 * 
 */
package com.equalityTest.inheritedVScomposition;

/**
 * @author Harshal-Git
 *
 */
public class ColorPoint extends Point{

	private final Color color;

	public ColorPoint(int xValue, int yValue, Color colorObj) {
		super(xValue, yValue);
		this.color= colorObj;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * Non compliant code: default implementation 
		 */
		//return defaultImpl(obj);

		/*
		 * Compliant code: above method will fail the symmetry condition. This is improved version.
		 */
		return improvedImpl(obj);
	}

	private boolean defaultImpl(Object obj) {
		/*
		 * only check for matching "ColorPoint" class and if it's not there, return false
		 */
		if(!(obj instanceof ColorPoint)) {
			return false;
		}
		// full comparison- when both objects are of ColorPoint
		return super.equals(obj) && (this.color.equals(((ColorPoint) obj).color));
	}

	private boolean improvedImpl(Object obj) {
		/*
		 * this will check if obj is not of "Point" and it's subtypes
		 */
		if(!(obj instanceof Point)) {
			return false;
		}
		/*
		 * This will check if obj is not of "ColorPoint" and it's subtypes
		 * but as previous conditions failed, it is certainly of "Point" type
		 * Hence call super class equals method - which will give color blind comparison
		 */
		if(!(obj instanceof ColorPoint)) {
			// Both statements will return same results
			return super.equals(obj);
			//return ((Point) obj).equals(this);
		}
		// full comparison- when both objects are of ColorPoint 
		return super.equals(obj) && (this.color.equals(((ColorPoint) obj).color));		
	}
}
