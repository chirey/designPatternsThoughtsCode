package com.structural.facade.pattern;

public class CClass {

	//Step 1.b - each of AClass, AClass and AClass has many methods having different signatures. 
	//For sake of simplycity we use dummy methods with very little logic
	public int methodC1(String str) {
		System.out.println("CClass.java: In methodC1");
		return 0;
	}

	public double methodC2(String str) {
		System.out.println("CClass.java: In methodC2");
		return 0;
	}

	public float methodC3(String str) {
		System.out.println("CClass.java: In methodC3");
		return 0;
	}
}
