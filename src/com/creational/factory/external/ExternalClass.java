package com.creational.factory.external;

import com.creational.factory.pattern.AInterface;
import com.creational.factory.pattern.FactoryOrCreatorClass;

//Step 1 - This is the external System
public class ExternalClass {

	//used to receive the objects NewSituationExternalClass will use
	private AInterface ai ; 
	
	//This is the factory for the objects
	private FactoryOrCreatorClass creator = null;
	
	
	// default constructor
	public ExternalClass() {
		creator = new FactoryOrCreatorClass();
		//Step 8 - receive the correct product
		ai = creator.obtain(1);
	}
	
	//Step 8 - using the product object
	public void userOfProductObjects(){
		String output = ai.someMethod(null);
		System.out.println(output);
	}
		
	

}
