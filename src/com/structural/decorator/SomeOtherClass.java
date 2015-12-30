package com.structural.decorator;

//This class represent other classes that may be available for the decorator to use for transforming the inputs or outputs i.e., for decoration
public class SomeOtherClass {

	public void saveToSomeDatabase(String var){
		//We save it to databases
		System.out.println("SomeOtherClass.java - saved the incoming argument \""+var + "\" to database");
	}

}
