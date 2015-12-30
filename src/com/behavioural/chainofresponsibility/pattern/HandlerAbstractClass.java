package com.behavioural.chainofresponsibility.pattern;

// Step 2 - this is the handler base class which will enforce the rule that all handlers are going to have the same handler method signature.

public abstract class HandlerAbstractClass {

	//Step 2a, 2b, 2c 
	//Note our handler method is called handle, it could be any name
	public abstract Output handle(Input input);
	
	//Step 2d we declare the concrete handlers
	protected HandlerAbstractClass nextHandler;

	//Step 2e Note we have only a setter, we do not need a getter here
	public void setNextHandler(HandlerAbstractClass nextHandlerVar) {
		this.nextHandler = nextHandlerVar;
	} 
	
	
}
