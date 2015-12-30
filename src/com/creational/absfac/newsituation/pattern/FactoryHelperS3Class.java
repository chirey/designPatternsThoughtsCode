package com.creational.absfac.newsituation.pattern;

import com.creational.absfac.existingsituation.pattern.ConcreteFactoryS2Class;
import com.creational.absfac.existingsituation.pattern.FactoryHelperClass;
import com.creational.absfac.existingsituation.pattern.FactoryInterface;

//Step 6a - the new factory helper class
public class FactoryHelperS3Class {
	
	
	public FactoryInterface obtainFactory(int factoryType) {
		FactoryInterface factoryInterface = null;
		
		FactoryHelperClass oldFactorObject = new FactoryHelperClass();
		
		//Step 6d - Return the new factory for the new sitaution while delegate the call to old factory for old situataions
		if (factoryType ==3){
			//Step 6d- Return the correct factory for this new situation
			factoryInterface = new ConcreteFactoryS3Class();
		} else if(factoryType == 1) {
			//Step 6d - delegate the call to previous old factories
			factoryInterface = oldFactorObject.obtainFactory(1);
		
		} else if (factoryType == 2){
			//Step 6d - delegate the call to previous old factories
			factoryInterface = oldFactorObject.obtainFactory(1);
		
		} else {
			System.out.println("ConcreteFactory.java : Unknown factoryType - Failed to intialize factory");
		}
		return factoryInterface; 
		
	}

}
