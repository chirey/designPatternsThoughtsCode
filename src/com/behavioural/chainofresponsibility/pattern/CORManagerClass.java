package com.behavioural.chainofresponsibility.pattern;

//Step 4 - Create the Manager CLASS
public class CORManagerClass {
	
	HandlerClass handleObject;
	
	HandlerAClass handleAObject;
	
	public HandlerAbstractClass getHandlerChain(){
		
		
		//Step 4.a Creating the handlers
		handleObject = new HandlerClass();
		handleAObject = new HandlerAClass();
		
		//Step 4.b
		//Creating the chain
		handleObject.setNextHandler(handleAObject);
		
		
		//Step 4.c
		//return the first handler so that the chain starts from the begining.
		return handleObject;
		
		
	}

}
