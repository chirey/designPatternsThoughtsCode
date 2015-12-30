package com.structural.facade.pattern;

public class AClass {

	
	//Step 1.b - each of AClass, AClass and AClass has many methods having different signatures. 
	//For sake of simplycity we use dummy methods with very little logic
	//Step 6 - we do not make this classes protected as we do not require to restrict the access.
	public String methodA1(String str) {
		System.out.println("AClass.java: In methodA1");
		return null;
	}

	public String methodA2(int value) {
		System.out.println("AClass.java: In methodA2");
		return null;
	}

	public String methodA3(double str) {
		System.out.println("AClass.java: In methodA3");
		return null;
	}

}
