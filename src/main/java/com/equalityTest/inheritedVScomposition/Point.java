/**
 * 
 */
package com.equalityTest.inheritedVScomposition;

/**
 * @author hcharadva
 * -> class to represent x, y points 
 */
public class Point {

	private final int x;
	private final int y;
	
	public Point(int xValue, int yValue) {
		this.x= xValue;
		this.y= yValue;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) {
			return false;
		}
		Point pointObj = (Point) obj;
		return pointObj.x== this.x && pointObj.y== this.y;
	}
}
