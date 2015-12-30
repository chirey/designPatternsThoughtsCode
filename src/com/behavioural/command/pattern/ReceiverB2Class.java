package com.behavioural.command.pattern;

/** 
 * This is an actual class which was to be called by some external system
 * 			there are many of such classes 
 * 			they contain methods which are different to other classes 
 * 
 * The method in question is method2 and it has a behaviour 3
 * @author Mak
 *
 */
public class ReceiverB2Class implements ReceiverBInterface {
	
	public ReceiverB2Class() {
		
	}
	
	//Step 1 - this is the method that would be called by external class. 
	//This method takes an int and gives an int.
	//Note Step 2 is in the NewSituationExternalClass
	@Override
	public int method2(int input){
		System.out.println("ReceiverB2Class.java : method2 invoked, this takes a int and outputs a int.");
		System.out.println("ReceiverB2Class.java : This is behaviour 3");
		return input; 
		
	}
}
