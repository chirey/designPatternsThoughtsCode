package com.structural.adapter.external;

/**
 * Step 8: ExternalClass usess the Adapter class instead of the AdapteeClass.
 *
 */
public class ExternalClass {

	// Step 8.a : Import and define the AdapterClass to be used
	private AdapterClass ac;

	public ExternalClass() {
		// Step 8.b - Acquire an AdapterClass, here we create it.
		ac = new AdapterClass();
	}

	public void doSomething() {
		System.out.println("ExternalClass.java : the original Adaptee class did not have a function with integer argument.");
		
		System.out.println("ExternalClass.java : Invoking the AdapterClass functions ");
		int input = 1;
		System.out.println("ExternalClass.java : Invoking the adapter method with input  of type integer " + input);
		String output = ac.expectedMethodSignature(input); 
		System.out.println("ExternalClass.java : The output from the Adapter - " + output);


	}

	//This method is to run the application to test the pattern.
	public static void main(String args[]) {

		ExternalClass ec = new ExternalClass();
		ec.doSomething();

	}

}
