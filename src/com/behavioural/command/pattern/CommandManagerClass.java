package com.behavioural.command.pattern;

/**
 * Step 5 - The Command Manager is the class which bears the responsibility of creating the command
 * giving the command a receiver. 
 * 
 * In this way if the command Manager chooses it can give the command a different receiver.  
 * 
 * Note step 6 is in the NewSituationExternalClass once again
 * @author Mak
 *
 */

public class CommandManagerClass {
	
	/**
	 * Step 5a. This class holds a command which it will give to others 
	 */
	private ConcreteCommandClass command;
	
	/** 
	 * Step 5b. 
	 * The method below always return the same command.
	 * In this case Command Manager does not behave as a FactoryInterface. 
	 * However, in case required, we could make this class as a FactoryInterface class.
	 * @return
	 */
	public CommandInterface getCommand(){
		return command;
	}
	
	/**
	 * Step 5c. This is the constructor, 
	 * the intialization happens here 
	 *  first is the command is created
	 *  second is the receiver is also set
	 *  third the receiver is set on the command
	 */
	public CommandManagerClass() {
		command = new ConcreteCommandClass();
		
		//Create the receiver
		ReceiverA1Class rc = new ReceiverA1Class();
		
		//Set the receiver
		command.setRc(rc);
	}
	
	
	

}
