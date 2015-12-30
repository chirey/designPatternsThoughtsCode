package com.structural.decorator;

//Step 6 - example test class
public class ExternalClass {
	
	public static void main (String args[]){
		//Step 6.a - Create or obtain the decoratedObject
		DecoratedClass decorated = new DecoratedClass();
		
		//Step 6.b - create the decorator object. Pass the decorator object.
		DecoratorClass decorator = new DecoratorClass(decorated);
		
		//Step 6.c - use the decorator.
		decorator.methodA("test msgA");
		
		//Step 6.d - example of double decoration
		DecoratorClass decorator2 = new DecoratorClass(decorator);
		decorator2.methodA("More decoration to ");
		
	}
}
