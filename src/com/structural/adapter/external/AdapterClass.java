package com.structural.adapter.external;

import com.structural.adapter.pattern.AdapteeClass;

/**
 * Note this class is in a package kept separate from Adaptee class
 * 			this is to emulate a realistic scenario where we have an AdapteeClass whcih we have to use
 * 			howeve rthe method signatures are not suitable.
 * Step 2 - create the AdapterClass. 
 * @author Mak
 *
 */
public class AdapterClass {
	
	// Step 4 : Use composition to get an object of the Adaptee Class
	private AdapteeClass adaptee;
	
	public AdapterClass() {
		//Step 5 : initialize the instance of the adaptee class.
		//In this case we instantiate it.
		adaptee = new  AdapteeClass();
	}

	//Step 3 - Create the method with the intended method signature
	public String expectedMethodSignature(int i) {
		System.out.println("AdapterClass.java : The expected method signature is input should be an int and output should be a string - ");
		//Step 6.c: Transform the input(s) as required
		//to simulate a mock transformation we increment the input
			i++;
		//Step 6.c The actual method takes a string so we convert the input into String
			String newInput = "" + i; 
		
		//Step 6.d invoke the actual method and receive the output
		//to demostrate an actual benefit, we enclose this in try catch,
		// as the original method would through a Runtime exception if things were incorrect. 
		double output = 0.0;
		try{
			output = adaptee.actualMethodSignature(newInput);
		}catch (Exception e){
			System.out.println("AdapterClass.java : The method invocation on Adaptee class failed - ");
		}
		
		
		//Step 6.e: Transform the output, the output is a double, however a String is required. 
		String newOutput = "" + output;
			
		//How to make sure it works
		System.out.println("AdapterClass.java : How it works is becuase in the expectedMethodSignature we  "
				+ "\n transformed and passed the inputs to the method of the Adaptee class"
				+ "\n obtained the output from the Adaptee class"
				+ "\n and handled other issues say exceptions if any"
				+ "\n and transformed the output as required"
				+ "\n and returned the transformed output."
				+ "\n and still reused the orignal method of the Adaptee class. ");
		
		System.out.println("AdapterClass.java : Note, deliberatly the transformations are kept trivial and simple for the sake of demonstration- ");
		
		
		//Step 6.f - return the output having the right type
		return newOutput;
	}
	
	//Step 6.g - Do this for all the methods that require a new signature
	//Step 7 - Ensure that there is no duplication of methods between AdapterClass and AdapteeClass
	

}
