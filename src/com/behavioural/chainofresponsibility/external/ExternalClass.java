package com.behavioural.chainofresponsibility.external;

import com.behavioural.chainofresponsibility.pattern.CORManagerClass;
import com.behavioural.chainofresponsibility.pattern.HandlerAbstractClass;
import com.behavioural.chainofresponsibility.pattern.Input;

public class ExternalClass {
	
	//Step 5 - creating a test client
	public static void main (String args[]){
		
		//Step 5.a - Obtain the manager
		CORManagerClass manager = new CORManagerClass();
		
		HandlerAbstractClass handlers = manager.getHandlerChain();
		
		
		//We now do two elementary tests, for which we require an input object; in the first case we keep the data as null, while int he second case it is not null. 
		Input input = new Input();
		input.setStrVarA(null);
		
		//Starting case 1 where we pass a null value;
		System.out.println("NewSituationExternalClass.java: Starting case 1 where we pass a null value");
		handlers.handle(input);
		
		//Starting case 2 where we pass a not null value;
		input.setStrVarA("testString");
		System.out.println("NewSituationExternalClass.java: Starting case 2 where we pass a not null value");
		handlers.handle(input);
		
	}

}
