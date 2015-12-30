package com.behavioural.visitor;

public class ExternalClass {

	public static void main(String args[]){
		
		//Step 3.a - create the visitor
		VisitorInterface visitor = new AVisitorClass();
		
		//Step 3b.	We create an instance of the ExistingClass.
		AExistingClass aExistingObject = new AExistingClass();
		aExistingObject.setVariableA("initial value");
		
		//General method call
		aExistingObject.methodA();
		
		//Step 3c - Call the method
		aExistingObject.accept(visitor);
		
		
		
		
		
		
		
		//Generalizing
		/**
		 * I can add any function to classes AExistingClass BExistingClass, though it was not there initially. 
		 * 
		 * 1. when ever I call ca.accept( with the new function in here) the function gets called. 
		 */
		
	}
	
	
}
