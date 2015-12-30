package com.structural.bridge.pattern;

//Step 3a - move the logic from the base class to the logic classes such as this class A1LogicConcreteClass
//Step 3b - Group the methods and create separate classes just holding the logic for the methods
//Step 3e - Extract the interface and make the logic class implement the interface. 
public class A1LogicConcreteClass implements ALogicInterface {

	//Step 3c - note that these method signature are different from the methods in the model classes
	//			though the methods in the model classes will actually use these methods.
	//Step 3.d - the difference in signature is to make sure the logic method signature fits the context and not dictated by the user of the methods (such as the model class)
	@Override
	public String a1Method(String input) {
		System.out.println("A1LogicConcreteClass.java a1Method logic is invoked");
		return null;
	}

	@Override
	public String a2Method() {
		System.out.println("A1LogicConcreteClass.java a2Method logic is invoked");
		return null;
	}

}
