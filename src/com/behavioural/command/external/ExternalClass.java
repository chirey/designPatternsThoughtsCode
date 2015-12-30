package com.behavioural.command.external;

import com.behavioural.command.pattern.CommandInterface;

/**
 * Step 2 - This External class is the invoker, it would use the method of the some class. 
 * Eventually this class would not know which class and which method it is using.
 * Next Step3 is in the command Interface  
 * @author Mak
 *
 */
public class ExternalClass {
	
	/**
	 * Step 6a. create a command object which the NewSituationExternalClass will use
	 */
	private CommandInterface command;
	/** 
	 * Step 6b. the constructor is used to initialise the command object.
	 */
	public ExternalClass(CommandInterface cm) {
		command = cm;
	}
	
	
	
	public void invokeTheMethod() {
		String someInput = "someInput";
		command.setInputArg1(someInput);
		System.out.println("NewSituationExternalClass.java : The input sent to the command was - :" + someInput +":");
		
		System.out.println("NewSituationExternalClass.java : the command now holds the input paramenter and the NewSituationExternalClass will now invoke the command. ");
		command.execute();
		
		System.out.println("NewSituationExternalClass.java : The command is exectuted now, The ExternalClas does not know who was the receiver of the command and who executed it. ");
		
		String output = command.getOutputArg1();
		
		System.out.println("NewSituationExternalClass.java : The NewSituationExternalClass now obtains the output from the command :" + output + ":");
		
		
	}

}
