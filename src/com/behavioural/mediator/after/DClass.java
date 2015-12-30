package com.behavioural.mediator.after;

import com.behavioural.mediator.after.pattern.InOutClass;
import com.behavioural.mediator.after.pattern.MediatorClass;

public class DClass {
    
    //Step 6.a - Define the mediator
    private MediatorClass mediatorObject;
    
   

	public float d1method(String input) {
		System.out.println("In d1method, input is "+ input + " and returning float interpretation of the string");
		return Float.parseFloat(input);
	}
	// Step 6.b - here we find similiarity and reuse the existing bAndCmethod of the mediator
	public String d2method(String input) {
	    
	    InOutClass inp  = new InOutClass();
	    inp.setStrVar(input);
	    
		String output = null;
	
		// Step 6.a - Instantiate or acquire it. In this case we do so here prior to use it.
		mediatorObject = new MediatorClass();  
		inp = mediatorObject.bAndcMethod(inp);
		output = inp.getStrVar();
		
		return output;
	} 
	
	
   
}
