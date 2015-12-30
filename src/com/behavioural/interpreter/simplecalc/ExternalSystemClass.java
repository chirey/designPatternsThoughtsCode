package com.behavioural.interpreter.simplecalc;

public class ExternalSystemClass {

	public static void main(String args[]) {

		//Step 1.	The ExternalSystemClass creates or obtains the ContextClass. 
		ContextClass c = new ContextClass();
		c.setInput("1+2+3+4+5+7");

		//Step 2.	The ExternalSystemClass creates an ExpressionInterpreterClass
		ExpressionInterpreterClass e = new ExpressionInterpreterClass();
		
		//Step 3.	The ExternalSystemClass passes the Context to ExpressionInterpreterClass
		e.setContext(c);
		
		//Step 4.	The ExternalSystemClass invokes the interpret method the ExpressionInterpreterClass. 
		e.interpret();

		//Step 8:   Output the interpreted result.
		System.out.println("\nThe output is " + c.getOutput());
	}

}
