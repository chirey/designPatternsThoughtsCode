package com.creational.absfac.existingsituation.pattern;

//Step 3a - Creating concrete factories
//Step 3d - Extract the factory interface
//Step 3e - Implement the factory interface
public class ConcreteFactoryS1Class implements FactoryInterface{
	
	ProductAInterface pA = null; 
	ProductBInterface pB = null;

	public ConcreteFactoryS1Class() {
			//Step 3b - proper product classes are instantiated
			pA = new ConcreteProductA1Class();
			pB = new ConcreteProductB1Class();
		
	}


	//Step 3b - getter to return the product objects
	//Step 3c - product objects are returned using interfaces
	@Override
	public ProductAInterface getProductA() {
		return pA;
	}

	@Override
	public ProductBInterface getProductB() {
		return pB;
	}

}
