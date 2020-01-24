Below properties must not be violated when we override an equals() method for any class:

1. Reflexivity
2. Symmetry
3. Transitivity
4. Consistency
5. Non - nullity

####################

Very important points:

-> SONAR promotes to use getClass() method inside overridden equals() method instead of "instanceOf".

-> Any child class; when it's compared with it's parent class with overridden equals() method of parent class, the below results are expected: 

1. getClass() - will return false
2. instanceOf - will return true 

--> instanceof : tests whether the object reference on the left-hand side (LHS) is an instance of the type on the right-hand side (RHS) or some sub type.

--> getClass() == ANYTHING :  tests whether the types are identical and it won't consider any sub type


https://stackoverflow.com/questions/596462/any-reason-to-prefer-getclass-over-instanceof-when-generating-equals

https://stackoverflow.com/questions/4989818/instanceof-vs-getclass

https://www.artima.com/intv/bloch.html#part17

Hence use "instanceOf" instead of "getClass()" whenever we have a child class equality check.

The Liskov substitution principle says that any important property of a type should also hold for its subtypes, so that any method 
written for the type should work equally well on its subtypes [Liskov87].
