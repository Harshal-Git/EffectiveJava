package com.equalityTest.inheritedVScomposition;

/**
 * @author hcharadva
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * RULE#1 : Symmetry rule
		 * if (pt == cpt1) then (cpt1== pt)
		 */
		Point pt= new Point(1, 2);
		ColorPoint cpt1= new ColorPoint(1, 2, new Color("RED"));
		
		System.out.println("Symmetry Case#1 ? - ");
		System.out.println("pt == cpt1? : "+(pt.equals(cpt1)));
		System.out.println("cpt1 == pt? : "+(cpt1.equals(pt)));
		
		/*
		 * RULE#2 : Transitivity rule understanding
		 * For all the existing equals() method conditions to pass RULE#1; it will break Transitivity rule.
		 * Means if pt.equals(cpt1)= TRUE and pt.equals(cpt2) = TRUE then cpt1.equals(cpt2) must be TRUE. 
		 */
		System.out.println("Transitivity Case#1 ? - ");
		
		ColorPoint cpt2= new ColorPoint(1, 2, new Color("BLUE"));
		
		System.out.println("pt == cpt1? : "+(pt.equals(cpt1)));
		System.out.println("pt == cpt2? : "+(pt.equals(cpt2)));
		System.out.println("cpt1 == cpt2? : "+(cpt1.equals(cpt2)));
		
		/*
		 * To eliminate these inconsistencies and make both rules valid even after providing an overridden equals() behavior we should 
		 * consider Liskov substitution principle.
		 * 
		 * Based on that instead of inheritance, we should consider composition.
		 * 
		 * This may not give expected results but the rules are not broken.
		 */
		ColorPointComposition cpc1= new ColorPointComposition(1, 2, "RED");
		ColorPointComposition cpc2= new ColorPointComposition(1, 2, "BLUE");
		
		System.out.println("\nSymmetry Case#2 ? - ");
		System.out.println("pt1 == cpc1? : "+(pt.equals(cpc1)));
		System.out.println("cpc1 == pt? : "+(cpc1.equals(pt)));
		
		System.out.println("Transitivity Case#2 ? - ");
		System.out.println("pt == cpc1? : "+(pt.equals(cpc1)));
		System.out.println("pt == cpc2? : "+(pt.equals(cpc2)));
		System.out.println("cpc1 == cpc2? : "+(cpc1.equals(cpc2)));
	}
}
