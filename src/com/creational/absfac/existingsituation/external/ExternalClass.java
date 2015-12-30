package com.creational.absfac.existingsituation.external;

import com.creational.absfac.existingsituation.pattern.FactoryHelperClass;
import com.creational.absfac.existingsituation.pattern.FactoryInterface;
import com.creational.absfac.existingsituation.pattern.ProductAInterface;
import com.creational.absfac.existingsituation.pattern.ProductBInterface;

public class ExternalClass {

	
	public static void main (String args[]){
		
		ProductAInterface pA = null; 
		ProductBInterface pB = null;
		
		int factoryType = 2; 
		//Step 5a - obtain the object of FactoryHelperClass
		FactoryHelperClass factoryHelperObject = new FactoryHelperClass();
		
		//Step 5b - invoke the method to get factory, pass situation argument
		//Step 5c - receive the output as a factory interface (only) and not as any concrete factories.
		FactoryInterface factoryInterface = factoryHelperObject.obtainFactory(factoryType);
		if(factoryInterface != null){
			
		//Step 5d - receive the product classes again using their product interfaces rather than concrete products. 
		pA = factoryInterface.getProductA();
		//Step 5e - Use the product objects
		pA.methodA();
		
		//Similarly do for the other product class as required
		pB = factoryInterface.getProductB();
		pB.methodB();
		} else 
			System.out.println("ExternalClass.java : FactoryInterface could not be found for the type - " + factoryType);
	}
}
