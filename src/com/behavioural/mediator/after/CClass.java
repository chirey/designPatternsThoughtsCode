package com.behavioural.mediator.after;

import com.behavioural.mediator.after.pattern.InOutClass;
import com.behavioural.mediator.after.pattern.MediatorClass;

public class CClass {
    
    //Step 6.a, b - We do not require the mediator here so omit the definitiona and intialization
    // private MediatorClass mediatorObject;

    //The changes are similar to that have been done for AClass
	public InOutClass c1method(InOutClass inp) {
	    int temp = inp.getIntVar();
		int tempSquared = temp * temp;
		String out ="Squared using c1method output = " + tempSquared; 
		inp.setStrVar(out);
		return inp;
	}

	
}
