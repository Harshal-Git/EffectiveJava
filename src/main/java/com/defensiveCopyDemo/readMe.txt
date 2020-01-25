In this test, the class "PeriodClient.java" is supposed to be immutable

This will accept 2 date objects (15 seconds apart) and compute the difference in seconds.
This class is not immutable as it's supposed to be because of the arguments.  

Defensive copying of parameters is not just for immutable classes. Any time we write a method or constructor that enters a 
client-provided object into an internal data structure, we need to think whether the client-provided object is potentially mutable.