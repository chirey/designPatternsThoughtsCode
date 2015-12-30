package com.structural.facade.pattern;

//Step 3 - Create the Facade class
public class FacadeClass {

	// Step 5 - Acquire the classes, same as Step 1.a, it now resides here.
	AClass aObject = new AClass();
	BClass bObject = new BClass();
	CClass cObject = new CClass();

	// Step 3.a - Targeting the method chain first. Creating broader functionality
	public double combinedMethod(String input) {
		
		//Step 3.a.ii - delegate the calls to actual classes and in the required sequence.
		String str = aObject.methodA1(null);
		double value = cObject.methodC2(str);
		System.out.println("FacadeClass.java: In combinedMethod" + value);
		return 0;
	}
	
	
	public String methodA1(String str) {
		System.out.println("FacadeClass.java: In methodA1");
		String out = aObject.methodA1(str);
		return out;
	}
	public String methodA2(int value) {
		System.out.println("FacadeClass.java: In methodA2");
		String out = aObject.methodA2(value);
		return out;
	}
	public String methodB3(String str, int value) {
		System.out.println("FacadeClass.java: In methodB3");
		String out = bObject.methodB3(str, value);
		return out;
	}
	public double methodC2(String str) {
		System.out.println("FacadeClass.java: In methodC2");
		double out = cObject.methodC2(str);
		return out;
	}
}
