package com.structural.composite;

//Step 1 - identify the classes which must be treated in the same way
//Step 3 - implement the common interface
public class AClass implements ACommonInterface {
	

	@Override
	public String methodA(String var){
		System.out.println("AClass.java: methodA is supported");
		return null;
	}
	
	@Override
	public String methodC(String var){
		System.out.println("AClass.java: methodC is supported");
			return null;
		}
	
	@Override
	public String methodB(String var){
		System.out.println("AClass.java: methodB is supported");
		return null;
	}
	
	
}
