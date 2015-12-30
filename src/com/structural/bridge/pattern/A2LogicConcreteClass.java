package com.structural.bridge.pattern;

//Step 4 - these are other logic classes, these create the logic classes hierarchy
//Other comments in A1LogicConcreteClass.java also applies here
public class A2LogicConcreteClass implements ALogicInterface{

	@Override
	public String a1Method(String input) {
		System.out.println("A2LogicConcreteClass.java a1Method logic is invoked");
		return null;
	}

	@Override
	public String a2Method() {
		System.out.println("A2LogicConcreteClass.java a2Method logic is invoked");
		return null;
	}

}
