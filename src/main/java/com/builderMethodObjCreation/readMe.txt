-> Telescoping constructors - NutritionFacts1.java :

Provide as many combinations as per number of class variables; including optional values. 

The telescoping constructor pattern works, but it is hard to write client code when there are many parameters, and harder still to read it.

-> JavaBeans approach - NutritionFacts2.java :

Provide default values to all members first and then use setter methods to set appropriate values and use getter method to read it.

Because construction / value setting is split across multiple calls, a JavaBean may be in an inconsistent state part-way through its construction. Hence the 
disadvantage is that the JavaBeans pattern precludes the possibility of making a class immutable, and requires added effort on the part of the programmer 
to ensure thread safety.

-> Builder pattern - NutritionFacts3.java : 

Instead of making the desired object directly, the client calls a constructor (or static factory) with all of the required parameters and gets a builder object.

Providing required values during the object creation itself and then calling individual setter method to set respective optional parameter. 

Then the client calls setter-like methods on the builder object to set each optional parameter of interest. Finally, the client calls a parameterless
method to generate the object, which is immutable.