package com.behavioural.mediator.after;

public class ExternalSystemClass {

	public static void main (String args[]){
		
		AClass aObject = new AClass();
		DClass dObject = new DClass();
		
		System.out.println("Call 1 - calling a1method with 2 as input" );
		String output = aObject.a1method("2.0");
		System.out.println("Output = " + output);
		
		System.out.println("\n\nCall 2 - calling d2method with 5.0 as input" );
		output =  dObject.d2method("5.0");
		System.out.println("Output = " + output);

	}
}
