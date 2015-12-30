package com.creational.absfac.newsituation.pattern;

import com.creational.absfac.existingsituation.pattern.ProductBInterface;

//Step 2a - extract the interface into ProductBInterface
public class ConcreteProductB3Class implements ProductBInterface{

	@Override
	public void methodB() {
		//Step 2c - logic is different compared to B1,B2
		System.out.println("ConcreteProductB3Class.java : Behavior B3 - ");
		
	}

}
