package com.structural.facade.pattern;

import java.util.HashMap;

public class BClass {

	//Step 1.b - each of AClass, AClass and AClass has many methods having different signatures. 
	//For sake of simplycity we use dummy methods with very little logic
	public Object methodB1(String str) {
		System.out.println("BClass.java: In methodB1");
		return null;
	}

	public HashMap methodB2(String str) {
		System.out.println("BClass.java: In methodB2");
		return null;
	}

	public String methodB3(String str, int value) {
		System.out.println("BClass.java: In methodB3");
		return null;
	}
}
