package com.creational.absfac.newsituation.pattern;

import com.creational.absfac.existingsituation.pattern.ProductAInterface;

//Step 6c.	Create new ProductClasses for this situation. 
public class ConcreteProductA3Class implements ProductAInterface{

	@Override
	public void methodA() {
		//Step 2c - logic is different compared to A1,A2
		System.out.println("ConcreteProductA3Class.java : Behavior A3 - ");
		
	}

}
