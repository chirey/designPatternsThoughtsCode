package com.structural.decorator;

//Step 1 - Identified that DecoratedClass is the one which require decoration.
public class DecoratedClass implements DecoratedInterface {

	private String strA;
	
	private String strB;
	
	public Float methodA(String msg){
		System.out.println("DecoratedClass.java - In methodA");
		Float f = new Float(2.0);
		return f;
	}
	
	public String methodB(String msg){
		System.out.println("DecoratedClass.java - In methodB");
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
