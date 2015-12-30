package com.creational.factory.pattern;

import com.creational.factory.pattern.products.A1Class;
import com.creational.factory.pattern.products.A2Class;
//Step4 - The factory class is created
public class FactoryOrCreatorClass {
	
	public FactoryOrCreatorClass() {
	
	}
	//Step 4a - the obtain method which returns object of type ProductInterface
	//Step 5a - decide on the type information which identifies the situation and
	public AInterface obtain(int type){
		AInterface aObject;
		if(type == 1){
			//Step 6 - instantiate the right object
			//Step 7d - receiving the product as product interfaces.
			aObject = new A1Class();
		} else {
			aObject = new A2Class();
		}
		
		//Step 7f - return the product object
		return aObject;
	}

}
