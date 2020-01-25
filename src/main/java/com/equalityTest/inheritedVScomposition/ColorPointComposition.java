/**
 * 
 */
package com.equalityTest.inheritedVScomposition;

/**
 * @author Harshal-Git
 * -> this class is similar to ColorPoint but only the difference is of composition of "Color" class instead of inheritance
 */
public class ColorPointComposition {

	private final Point point;
	private final Color color;
	
	public ColorPointComposition(int x, int y, String colorStr) {
		if(colorStr== null) {
			throw new NullPointerException();
		}
		point= new Point(x, y);
		color= new Color(colorStr);
	}
	
	public Point getPoint() {
		return this.point;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	@Override
	public boolean equals(Object obj) {
		// validate only current class instance
		if(!(obj instanceof ColorPointComposition)) {
			return false;
		}
		// now we know current class compositions only is present and has to be evaluated - so perform full comparison with both compositions  
		ColorPointComposition currentObj= (ColorPointComposition) obj;
		return currentObj.getColor().equals(this.getColor()) && currentObj.getPoint().equals(this.getPoint());
	}
}
