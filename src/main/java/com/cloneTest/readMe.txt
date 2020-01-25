This is an example of shallow copy via clone() method. After cloning it will refer to the same data from original object.
Hence if you modify the data via cloned object, it will be reflected in actual object.
 
So need to take care of inner components inside the overridden clone() method. 