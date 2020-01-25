This is an example to show that the constructors of the classes which are expected to be overridden should never call any method inside 
their constructor directly OR indirectly.

Because of this, the final date field inside child class will observe 2 different states: null AND actual value
 
Here, SuperClass class constructor calls a method - which is expected to be overridden.
Hence before the ChildClass gets time to set the date member, parent class constructor and method is called and hence the data is populated as null.