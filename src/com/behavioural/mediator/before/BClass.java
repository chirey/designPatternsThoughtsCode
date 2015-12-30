package com.behavioural.mediator.before;

public class BClass {

	private DClass dObject;
	
	public int b1method(String input) {
		float fTemp;
		
		dObject = new DClass();
		fTemp = dObject.d1method(input);
	
		System.out.println("In method b1method trimming float to int");
		
		return (int) fTemp;
	}

}
