package com.behavioural.visitor;

//Step 2a. Create concrete visitor class, implement VisitorInterface
public class AVisitorClass implements VisitorInterface {

	public void execute(AExistingClass aExistingClass) {
		//Step 2b. Create the logic for the new method.
		System.out.println("We have added a new function to aExistingObject without modifying Class A");
		System.out.println("Further there is access to object of AExistingClass variableA = " + aExistingClass.getVariableA());
		
	}

	
		
	

}
