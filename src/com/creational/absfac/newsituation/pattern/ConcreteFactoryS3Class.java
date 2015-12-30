package com.creational.absfac.newsituation.pattern;

import com.creational.absfac.existingsituation.pattern.ConcreteProductA2Class;
import com.creational.absfac.existingsituation.pattern.ConcreteProductB2Class;
import com.creational.absfac.existingsituation.pattern.FactoryInterface;
import com.creational.absfac.existingsituation.pattern.ProductAInterface;
import com.creational.absfac.existingsituation.pattern.ProductBInterface;

////Step 6b - the new concrete factory class
public class ConcreteFactoryS3Class implements FactoryInterface {

	ProductAInterface pA = null; 
	ProductBInterface pB = null;

	public ConcreteFactoryS3Class() {
		//Step 3b - proper product classes are instantiated, notice we are using product 3
		pA = new ConcreteProductA3Class();
		pB = new ConcreteProductB3Class();
	}
	
	@Override
	public ProductAInterface getProductA() {
		return pA;
	}

	@Override
	public ProductBInterface getProductB() {
		return pB;
	}

}
