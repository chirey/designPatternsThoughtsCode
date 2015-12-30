package com.behavioural.command.pattern;

/**
 * Step 4 - This is to create all concrete command classes. 
 * Note Step 5 is in the command manager class.
 * @author MBiswas
 *
 */
//
public class ConcreteCommandClass implements CommandInterface {
	
	//Step 4a.i - these variables are the way to communicate from NewSituationExternalClass to the Receiver class 
	private String inputArg1;
	private String outputArg1;
	
	//Step 4b. using a receiver class. 
	//Note we are referring to the interface
	private ReceiverAInterface rc;
	
	
	//Step 4c. this is where the command 
	// passes the inputs to the receiver
	// executes the method
	// receives the output 
	@Override
	public void execute() {
		
		outputArg1 = rc.method1(inputArg1);
		
	}
	
	//Step 4d. the setter and getter methods to initialize the variables.
	public ReceiverAInterface getRc() {
		return rc;
	}
	public void setRc(ReceiverAInterface rc) {
		this.rc = rc;
	}

	public String getInputArg1() {
		return inputArg1;
	}


	@Override
	public void setInputArg1(String inputArg1) {
		this.inputArg1 = inputArg1;
	}


	@Override
	public String getOutputArg1() {
		return outputArg1;
	}


	public void setOutputArg1(String outputArg1) {
		this.outputArg1 = outputArg1;
	}


}
