package com.behavioural.mediator.after.pattern;

import com.behavioural.mediator.after.BClass;
import com.behavioural.mediator.after.CClass;
import com.behavioural.mediator.after.DClass;

//Step 5 - Create the MediatorClass class
public class MediatorClass {
	
	private BClass bObject = null;
	private CClass cObject = null;
	private DClass dObject = null;
	
	//Step 5.d - create the required objects
	public MediatorClass() {
		bObject = new BClass();

		
		cObject = new CClass();
		
		
		dObject = new DClass();
   }
	
	//Step 5.a - bring the methods beloging to individual classes on to this class. Name appropriately
	//Step 5.b - change the input and output arguments to take in the general input and output holder class.
	public InOutClass bAndcMethod(InOutClass inout) {
		String output = null;
		
		int temp;
		
		
		//Step 5.c - c.	The method of this class will use the variables within the input output classes to acquire and return data.
		System.out.println("In a1method, calling b1method with input = " + inout.getStrVar() );
		temp = bObject.b1method(inout.getStrVar());
		
		
		//Step 5.b - change the input and output arguments to take in the general input and output holder class.
		InOutClass inp2 = new InOutClass();
		inp2.setIntVar(temp);
		inp2 = cObject.c1method(inp2); // Note we are reusing InOutClass for both input and output
		output = inp2.getStrVar();
		
		//Step 5.c - set the output with the input output classes, return the output
		// Note we are reusing InOutClass for both input and output
		inout.setStrVar(output);
		return inout;
	}

	//Repeat steps 
	public InOutClass dmethod(InOutClass input) {
	    
	  //Step 5.b - change the input and output arguments to take in the general input and output holder class.
	  float f = dObject.d1method(input.getStrVar()); // Note we are reusing InOutClass for both input and output
	  
	  input.setFloatVar(f);
            
      return input;
	}

}
