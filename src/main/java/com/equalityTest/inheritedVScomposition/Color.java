/**
 * 
 */
package com.equalityTest.inheritedVScomposition;

/**
 * @author hcharadva
 * -> Simple "Color" class with an overridden equals() method to compare instance first and then match color value string. 
 */
public class Color {

	private final String color;
	
	public Color(String color) {
		this.color= color;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Color)) {
			return false;
		}
		return this.color.equalsIgnoreCase(((Color) obj).color);
	}
}
