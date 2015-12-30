package com.behavioural.mediator.before;


public class AClass {
	
	private BClass bObject = null;
	private CClass cObject = null;
	
	public AClass(){
		bObject = new BClass();
		cObject = new CClass();
		
	}
	
	
	
	public String a1method(String input) {
		String output = null;
		
		int temp;
		
		System.out.println("In a1method, calling b1method with input = " + input );
		temp = bObject.b1method(input);
		
		
		output = cObject.c1method(temp);
		
		return output;
	}

}
