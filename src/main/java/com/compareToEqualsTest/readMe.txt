This inconsistency between different concrete implementation happens because the way equals() and compareTo() results don't match for BigDecimal.
  
For equals() method of BigDecimal; 1.0 and 1.00 are not same.
For compareTo() method of BigDecimal; 1.0 and 1.00 are same. (refer java doc for the methods)
 
Whenever we use sorted collection (explained below), the respective compareTo() method is used instead of equals() from BigDecimal class.
As both methods don't provide the results in similar manner; the concrete implementation insertion will also result differently. 
 
Non sorted collections will consider results of equals() method during insertion while sorted collections will consider compareTo() - default implementation of that data type.