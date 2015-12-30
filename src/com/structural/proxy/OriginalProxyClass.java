package com.structural.proxy;

//Step 3 the original proxy class
//Step 5.a - implement the interface
public class OriginalProxyClass implements OriginalInterface {

	//Step 4 - variable of the OriginalClass
	private OriginalClass originalObject;
	
	//Step 5.b - create the logic to initialize the object
	private void initialize(){
		if(originalObject == null)
			originalObject = new OriginalClass();
		
	}
	
	public OriginalProxyClass() {
		//Step 5.c this step should not be there, hence commented
		//initialize();
		System.out.println("OriginalProxyClass.java - in default constructor");
	}

	@Override
	public String methodA(Double d) {
		System.out.println("OriginalProxyClass.java - in methodA");
		//Step 5.d.i - initialize the originalObject if not already done.
		initialize();
		//Step 5.d.ii, iii, iv - call the same method of originalObject, delegate the call, retrieve the output
		String output = originalObject.methodA(d);
		//Step 5.e - relay the info
		return output;
	}

	@Override
	public String methodB(Integer i, Double d) {
		System.out.println("OriginalProxyClass.java - in methodB");
		//Step 5.e - Repeat for all other steps
		initialize();
		String output = originalObject.methodB(i, d);
		return output;
	}

	@Override
	public Object methodC(Double d) {
		System.out.println("OriginalProxyClass.java - in methodC");
		initialize();
		Object output = originalObject.methodC(d);
		return output;
	}

	
	public static void aStaticMethod() {
		System.out.println("OriginalProxyClass.java - in aStaticMethod");
	}
	
	
}
