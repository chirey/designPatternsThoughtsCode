package com.creational.absfac.existingsituation.pattern;

//Step 2b - Other product classes of type B were made to implement ProductBInterface
public class ConcreteProductB2Class implements ProductBInterface{

	@Override
	public void methodB() {
		//Step 2c - logic is different compared to B1
		System.out.println("ConcreteProductB2Class.java : Behavior B2 - ");
		
	}

}
