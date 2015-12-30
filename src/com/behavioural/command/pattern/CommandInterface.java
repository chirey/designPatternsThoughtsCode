package com.behavioural.command.pattern;

/**
 * Step 3 - we create the command interface.
 * Note step 4 is in concrete command classes 
 * @author Mak
 *
 */

public interface CommandInterface {

	//Step 3 - include a method that will be used to trigger the call
	public void execute();

	/**
	 * Step 4a.ii - include methods to get output
	 * @return
	 */
	public abstract String getOutputArg1();

	/**
	 * Step  4a.ii - include method to set input
	 * @param inputArg1
	 */
	public abstract void setInputArg1(String inputArg1);
	
	
}
