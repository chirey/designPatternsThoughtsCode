package com.structural.proxy;

//Step 6 - The external class
public class ExternalClass {
	//Step 6.a - know the class by the interface
	private OriginalInterface object;
	
	//Step 6.b - creating the setter function
	public void setObject(OriginalInterface object) {
		this.object = object;
	}
	
	public ExternalClass() {
		System.out.println("ExternalClass.java - The default constructor has been called, normally it is here the objects are intialized. But using proxy we shall initialize this when the methods are called on the object and not before.");
	}
	public void doSomething(){
		//Step 6.c - use the methods as required
		object.methodA(0.0);
		object.methodB(1, 9.1);
	}
}
