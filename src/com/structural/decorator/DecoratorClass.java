package com.structural.decorator;

//Step 3 - Create the decorated interface
//Step 3.c - Implement the DecoratedInteface
public class DecoratorClass implements DecoratedInterface {

	// Step 3a - Declare an object of the DecoratedClass.
	private DecoratedInterface decoratedObject;

	private double var = 2.0;

	// Step 3b - initialize the variable
	public DecoratorClass(DecoratedInterface decoratedObj) {
		this.decoratedObject = decoratedObj;
	}

	// Step 4 - this method requires decoration
	public Float methodA(String msg) {

		// Step 4.a - Add value step to input
		// use variables and methods of DecoratorClass as required
		//Step 4f - input transformation is done prior to delegation
		msg = msg + var;
		logData(msg);
		SomeOtherClass someOtherObject = new SomeOtherClass();
		someOtherObject.saveToSomeDatabase(msg);

		// Step 4.b - delegate the call, use the transformed input
		Float output = decoratedObject.methodA(msg);

		// Step 4.c - Add value to output
		int hash = output.hashCode();
		Float fVar = new Float(hash);
		logData("" + fVar);
		//Step 4f - output transformation is done after the delegation
		
		// Step 4.d - Note that the transformation for input and output are
		// different and based on context.

		// Step 4.e - the final result after transformations of the input is
		// String. While for output it is Float. Whatever be the intermediate
		// object types the initial and final types must be the same.s

		//Step 4.g - the final output is returned
		return fVar;
	}

	//Step 5 - This method does not require decoration hence we just delegate the call and relay the output
	public String methodB(String msg) {
		return decoratedObject.methodB(msg);
	}

	//Extra methods that may exist in this class
	public void logData(String msg) {
		System.out.println("DecoratorClass.java - the message is printed on the console for logging " + msg);
	}

}
