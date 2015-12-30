package com.creational.singleton.external;

import com.creational.singleton.pattern.ASingletonClass;

/**
 * Step: define how external classes will use the singleton. 
 * @author Mak
 *
 */
public class ExternalClass {
	
	//Step 7a - create an object to use
	ASingletonClass sc ;
	
	public ExternalClass() {
		// Step7b obtain the instance
		sc = ASingletonClass.getInstance();
	}

	public void printInfo() {
		
		String output = sc.performSomeCalculation();
		System.out.println("ExternalClass.java : externalObject id = " + this.hashCode());
		System.out.println("ExternalClass.java : Output from the singleton - " + output);
		System.out.println("ExternalClass.java : aSingletonObject id = " + sc.hashCode());
	}

}
