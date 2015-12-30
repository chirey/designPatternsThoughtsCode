package com.behavioural.command.pattern;

/** 
 * This is an actual class whose methods were to be called by some external system
 * There are many of such classes, this is one such class. 
 * These classes contain methods which are different to other classes 
 * These are called the <B> Receiver </B>classes
 * 
 * The method in question is method1 and it has another behaviour
 * 
 * 
 * @author Mak
 *
 */
public class ReceiverA2Class implements ReceiverAInterface {
	
	public ReceiverA2Class() {
		
	}
	
	//Step 1 - this is the method that would be called by external class. 
	//This method takes an String and gives an String.
	//Note Step 2 is in the NewSituationExternalClass
	public String method1(String input){
		System.out.println("ReceiverA2Class.java : method1 invoked, this takes a string and outputs a string.");
		System.out.println("ReceiverA2Class.java : The is the another behavior.");
		input = input + "2"; // say some processing was done
		return input; 
		
	}
}
