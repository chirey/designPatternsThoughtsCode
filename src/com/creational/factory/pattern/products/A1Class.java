package com.creational.factory.pattern.products;

import com.creational.factory.pattern.AInterface;

//Step 2 - identify the product clases, extract the interface 
//Step 3 - make the class implement the interface
public class A1Class implements AInterface{

	
	@Override
	public String someMethod(String args[]) {
		System.out.println("A1Class: something is being done");
		return "SituationA";
	}

}
