package com.behavioural.mediator.after;

import com.behavioural.mediator.after.pattern.InOutClass;
import com.behavioural.mediator.after.pattern.MediatorClass;


public class AClass {
	
	//Step 6.d - Clean up the class
//	private BClass bObject = null;
//	private CClass cObject = null;
	
	//Step 6.a - Define the mediator
	private MediatorClass mediatorObject;
	
	public AClass(){
		//Step 6.d - Clean up the class
//		bObject = new BClass();
//		cObject = new CClass();
			
	}
	
	
	
	//Step 6.c - use the mediatorObject
	public String a1method(String str) {
		
		//Step 6.c.1 - create the input object. 
		InOutClass input = new InOutClass();
		
		input.setStrVar(str);
		
		//Step 6.c.ii and iii - Delegate the call. 
		//Step 6.a - Initialize the mediator, 
        mediatorObject = new MediatorClass();
		InOutClass output = mediatorObject.bAndcMethod(input);
		
		//Step 6.c.iv - Obtain the output from within the input output class.
		String strOutput= output.getStrVar();
		
		
		return strOutput;
	}



	

}
