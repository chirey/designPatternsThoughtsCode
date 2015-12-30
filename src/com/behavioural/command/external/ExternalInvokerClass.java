package com.behavioural.command.external;

import com.behavioural.command.pattern.CommandInterface;
import com.behavioural.command.pattern.CommandManagerClass;

/**
 * Step 6. This is used to house the main method so that we have an executable program.
 * 
 * This is actually the Invoker
 * @author Mak
 *
 */


public class ExternalInvokerClass {
	
	/**
	 * Step 6a. create an object of the CommandManagerClass type
	 */
	private static CommandManagerClass cm;
	
	/**
	 * Step 6b. the command object that is used by our invoke method to delegate the call. 
	 */
	private static CommandInterface command;
	
	//Create an External Class
	private static ExternalClass ec;


	/**
	 * Note in this class since we are not instantiating a class we are required to declare all variables static. This is for simplicity
	 * @param args
	 */
	public static void main (String args[]) {
		System.out.println("NewSituationExternalClass.java : Demostration of command pattern - ");
		
		//Create the command manager
		cm = new CommandManagerClass();
		
		//get the command
		command = cm.getCommand();
		
		//Pass it to ExternalSystemClass to use
		ec = new ExternalClass(command);
		
		//we call a method on External Class
		ec.invokeTheMethod();
		
	}


	
	

}
