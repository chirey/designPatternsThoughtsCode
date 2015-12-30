package com.behavioural.iterator;

import java.util.ArrayList;

public class ExternalSystemClass {
	
	public static void main (String args[]){
		
		//Step 6.i - here we are creating the collection and inserting some values for 
		//		test purpose, this is only for testing
		// 		the external systems do not require the collection to be imported
		// 		they require import only 
		//				the iterator from the collection 
		//				and the object within the iterator (which in this case is String, hence imported by default
		ArrayList<String> arl = new ArrayList<String> ();
		
		//Intialization for test purpose
		arl.add("a");
		arl.add("b");
		arl.add("c");
		arl.add("d");
		arl.add("e");
		arl.add("f");
		
		
		//Step 6.ii Obtain the iterator
		CustomIteratorInterface iter = new  ConcreteIteratorClass(arl);
		
		//Step 6.iii Navigate the collection
		String output;
		output = iter.getSecondNext();
		System.out.println("The value is " + output);

		output = iter.getNext();
		System.out.println("The value is " + output);
		
		
	}

}
