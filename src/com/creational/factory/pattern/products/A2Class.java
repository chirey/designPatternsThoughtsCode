package com.creational.factory.pattern.products;

import com.creational.factory.pattern.AInterface;

public class A2Class implements AInterface{

	
	@Override
	public String someMethod(String args[]) {
		System.out.println("A2Class: something different is being done");
		return "Situation B";
	}

}
