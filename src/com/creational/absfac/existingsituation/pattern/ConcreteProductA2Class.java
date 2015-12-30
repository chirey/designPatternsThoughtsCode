package com.creational.absfac.existingsituation.pattern;

//Step 2b - Other product classes of type A were made to implement ProductAInterface
public class ConcreteProductA2Class implements ProductAInterface{

	@Override
	public void methodA() {
		//Step 2c - logic is different compared to A1
		System.out.println("ConcreteProductA2Class.java : Behavior A2  ");
		
	}

}
