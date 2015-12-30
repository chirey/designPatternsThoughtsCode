package com.creational.absfac.existingsituation.pattern;

//Step 4 - creating a factory class that returns the concrete factories 
public class FactoryHelperClass {
	
	
	public FactoryInterface obtainFactory(int factoryType) {
		FactoryInterface factoryInterface = null;
		if(factoryType == 1) {
			factoryInterface = new ConcreteFactoryS1Class();
		
		} else if (factoryType == 2){
			factoryInterface = new ConcreteFactoryS2Class();
		
		} else {
			System.out.println("FactoryHelperClass.java : Unknown factoryType - Failed to intialize factory");
		}
		return factoryInterface; 
		
	}

}
