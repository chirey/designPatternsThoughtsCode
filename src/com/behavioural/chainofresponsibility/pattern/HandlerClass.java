package com.behavioural.chainofresponsibility.pattern;

//Step 3 - A handler class is created
//Step 3a - we make the handler extend the HandlerAbstractClass
public class HandlerClass extends HandlerAbstractClass {

	@Override
	public Output handle(Input input) {
		
		//Step 3.b.i  - check if this HandlerClass is the one to handle the request
		//For this (say) we do a null check on the input
		if(input != null && input.getStrVarA() == null){
			//Step 3.b.i.1 - we can process the object
				//Here by processing we mean 2 things
					// use or (not use and do nothing) the input in any way depending upon context, which may or may not result in chaging the values within the input object and 
					// return the desired return type
				//In this case we do nothing with the input object and just log the message
			System.out.println("HandlerClass.java: The input is null");
			
			//Step 3.b.i.2 - we send out the return type. 
				// we do not have any object so have to create one Output object or return null
			Output out = new Output();
			
			//Step 3.b.i.3 - we could send out the processed input
				// In our case since we have not touched it it remains null.
				// This step is optional
			out.setStrVarB(null);
			
			//Completing step 3.b.i.2
			return out;
				
		} else {
			//Step 3.b.iii - we chain the input to the next handler as this handler will not be the one to handle it
			// we also return the object that would be given by the next handler
			return nextHandler.handle(input);
			
		}
		
		
		
		
		

	}

}
