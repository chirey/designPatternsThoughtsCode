package com.structural.bridge.pattern;

//Step 4 - these are other logic classes, these create the logic classes hierarchy
//Other comments in A1LogicConcreteClass.java also applies here
//Step 4.a - Note this Logic class does not implement the LogicInterface but extends from A2LogicConcreteClass
public class A3LogicConcreteClass extends A2LogicConcreteClass {

	@Override
	public String a1Method(String input) {
		System.out.println("A3LogicConcreteClass.java a1Method logic is invoked");
		return null;
	}

	@Override
	public String a2Method() {
		System.out.println("A3LogicConcreteClass.java a1Method logic is invoked");
		return null;
	}

}
