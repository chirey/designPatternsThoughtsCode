package com.behavioural.iterator;

//Step 2.	Create an interface CustomIteratorInterface with the required traversal methods. The methods take no argument, their names are representative of their actions and they return Object. 
// 		Extend it from java.util.Interface if required. 
public interface CustomIteratorInterface {
	
	public boolean hasNext();
	public String getNext();
	public String getSecondNext();

}
