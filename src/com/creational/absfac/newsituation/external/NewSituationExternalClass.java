package com.creational.absfac.newsituation.external;

import com.creational.absfac.existingsituation.pattern.FactoryInterface;
import com.creational.absfac.existingsituation.pattern.ProductAInterface;
import com.creational.absfac.existingsituation.pattern.ProductBInterface;
import com.creational.absfac.newsituation.pattern.FactoryHelperS3Class;

public class NewSituationExternalClass {

	
	public static void main (String args[]){
		
		ProductAInterface pA = null; 
		ProductBInterface pB = null;
		
		//our new situation is represented by value 3
		int factoryType = 3;
		
		//Step 6e - we use the new factory
		FactoryHelperS3Class factoryHelpers3Object = new FactoryHelperS3Class();
		
		//Step 5b - invoke the method to get factory, pass situation argument
		//Step 5c - receive the output as a factory interface (only) and not as any concrete factories.
		FactoryInterface factoryInterface = factoryHelpers3Object.obtainFactory(factoryType);
		if(factoryInterface != null){
			
		//Step 5d - receive the product classes again using their product interfaces rather than concrete products. 
		pA = factoryInterface.getProductA();
		//Step 5e - Use the product objects
		pA.methodA();
		
		//Similarly do for the other product class as required
		pB = factoryInterface.getProductB();
		pB.methodB();
		} else 
			System.out.println("NewSituationExternalClass.java : FactoryInterface could not be found for the type - " + factoryType);
	}
}
