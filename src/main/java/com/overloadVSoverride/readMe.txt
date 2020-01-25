1. OverloadClient.java:

In this program, we are putting different types of concrete collection implementation objects into a Collection array and trying to identify that concrete
implementation class type. 
 
For all three iterations of the classify() method loop, the compile-time type of the parameter is the same: Collection<?>. The runtime type is 
different in each iteration, but this does not affect the choice of overloading. Because the compile-time type of the parameter is Collection<?>, 
the only applicable overloading is the third one, classify(Collection<?>), and this overloading is invoked in each iteration of the loop.

To overcome this, the option "instanceOf" check is given. Considering that, no further method override is needed.



2. OverrideClient.java:

 The behavior similar to overloaded methods, is explained with overridden methods.
 Overridden methods gets identified at run time.
 
 
 3. ZzOverloadedAPIIssue.java:

This program is to show case how overload can create problem which is existing in Java API of list remove.

For this program; initially we are inserting 6 values in tree set and a list : form -3 to 2
 
Once inserted; we are calling remove methods on both collections.
 
The remove() for set- will behave properly where it will remove the elements from the positions: 4 to 6
But remove() for list - will behave very weirdly.
  
THE remove() METHOD FOR LIST IS OVERLOADED WITH 2 VERSIONS.
One accepts an "int" argument and removes the element from that given "int" index
Another method accepts an "Object" and it will remove the given object from complete collection.

That's why if we want results as set; we need to manually cast the given index into wrapper object to get the result same as set.  