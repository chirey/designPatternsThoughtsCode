package com.creational.factory.pattern;

public interface AInterface {

	//This is the method that all product classes will use. 
	//Product classes are like A1Class, A2Class which have the same method but behave differently i.e. has different logic
	public String someMethod(String ags[]);
	
	
}
