package com.structural.bridge.pattern;

//Step 1.a - Identify the hierarchy of model classes. Here we identify that 
// ModelASubClass and ModelBSubClass both extends from ModelOrAbstractionOrBaseClass which serves as the base class

//Step 2 - Create the base class
//Step 2.b - move the common methods to the base class (the signature is common/same but the logic was different)
public class ModelOrAbstractionOrBaseClass {

	//Step 5a - a variable of the logic interface
	private ALogicInterface aLogicInteface;

	private BLogicInterface bLogicInteface;

	//Step 5.b - setter for the interface variable
	public void setaLogicInteface(ALogicInterface aLogicInteface) {
		this.aLogicInteface = aLogicInteface;
	}

	public void setbLogicInteface(BLogicInterface bLogicInteface) {
		this.bLogicInteface = bLogicInteface;
	}

	public Object a1ModelMethod(Object input) {
		System.out.println("ModelOrAbstractionOrBaseClass.java a1ModelMethod logic is invoked");

		//Step 5.c.ii - input transformation
		String strInp = (String) input;
		
		//Step 5.c.i - delegation to a concrete logic class
		String strOut = aLogicInteface.a1Method(strInp);

		//Step 5.c.ii - output transformation steps if required, in this case it is not so we just return the output.
		
		return strOut;
	}

	public Object a2ModelMethod(Object input) {
		System.out.println("ModelOrAbstractionOrBaseClass.java a2ModelMethod logic is invoked");

		String strOut = aLogicInteface.a2Method();

		return strOut;

	}

	public Object b1ModelMethod(Object input) {
		System.out.println("ModelOrAbstractionOrBaseClass.java b1ModelMethod logic is invoked");

		String strInp = (String) input;
		bLogicInteface.b1Method(strInp);

		return null;
	}

}
