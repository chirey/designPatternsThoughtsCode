package com.structural.proxy;

//Step 1 - Identified OriginalClass as the class which requires a proxy
public class OriginalClass implements OriginalInterface {
	
	private String strA;
	
	private String strB;
	

	public OriginalClass() {
		System.out.println("OriginalClass.java - default constructor has been called and object has been created");
	}
	
	public String methodA(Double d){
		System.out.println("OriginalClass.java: methodA is called");
		return null;
	}

	public String methodB(Integer i, Double d){
		System.out.println("OriginalClass.java: methodB is called");
		return null;
	}

	public Object methodC(Double d){
		System.out.println("OriginalClass.java: methodC is called");
		return null;
	}

	public String getStrA() {
		return strA;
	}

	public void setStrA(String strA) {
		this.strA = strA;
	}

	public String getStrB() {
		return strB;
	}

	public void setStrB(String strB) {
		this.strB = strB;
	}
	
	
}
