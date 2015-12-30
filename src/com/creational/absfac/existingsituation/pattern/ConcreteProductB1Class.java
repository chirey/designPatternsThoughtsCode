package com.creational.absfac.existingsituation.pattern;

//Step 2a - extract the interface into ProductBInterface
public class ConcreteProductB1Class implements ProductBInterface{

	@Override
	public void methodB() {
		//Step 2c - logic is different compared to B2
		System.out.println("ConcreteProductB1Class.java : Behavior B1 - ");
		
	}

}
