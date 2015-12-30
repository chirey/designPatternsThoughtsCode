package com.behavioural.mediator.before;

public class DClass {

	public float d1method(String input) {
		
		System.out.println("In d1method, input is "+ input + " and returning float interpretation of the string");
		return Float.parseFloat(input);
	}
	
	public String d2method(String input) {
		String output = null;
		
		int temp;
		
		BClass bObject = new BClass();
		System.out.println("In d2method, calling b1method with input = " + input );
		temp = bObject.b1method(input);
		
		CClass cObject = new CClass();
		System.out.println("In d2method, calling c1method with input = " + temp);
		output = cObject.c1method(temp);
		
		return output;
	} 

}
