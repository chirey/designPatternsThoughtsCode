package com.creational.singleton.pattern;

/**
 * Step 1 - Created the singleton without Singleton pattern implemented. Note this is put in a separate package to make
 * it separate from the external users of this class.
 * 
 * @author Mak
 *
 */

public class ASingletonClass {

	// Step 2: make this private so that no one can access it.
	private ASingletonClass() {

		//Step 4.a.ii - create all the objects that the singleton requries and protects.
	}

	// Step 3: create a handle for the instance
	// make it private so that on ASingletonClass has access to this
	// make it static so that this is defined at class level.
	private static ASingletonClass sc = null;

	//Step4 - create the standard getInstance()
	public static ASingletonClass getInstance() {
		// Step 4.a - we just check if the instance is initialised
		if (sc == null) {
			sc = new ASingletonClass();
		} else
			; //Step 4.a.ii do nothing
		//Step 4.b - return the object
		return sc;
	}

	/*Step 5 The setter and getters are commented
	public static void setSc(ASingletonClass sc) {
		ASingletonClass.sc = sc;
	}
	public static ASingletonClass getSc() {
		return sc;
	}
	*/
	
	
	public String performSomeCalculation() {
		return "someIrrelevantOutput";
	}

}
