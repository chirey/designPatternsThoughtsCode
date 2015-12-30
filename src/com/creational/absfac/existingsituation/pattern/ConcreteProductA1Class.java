package com.creational.absfac.existingsituation.pattern;

//Step 2a - extract the interface into ProductAInterface
public class ConcreteProductA1Class implements ProductAInterface{

	@Override
	public void methodA() {
		//Step 2c - logic is different compared to A2
		System.out.println("ConcreteProductA1Class.java : Behavior A1 - ");
		
	}

}
