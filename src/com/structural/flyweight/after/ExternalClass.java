package com.structural.flyweight.after;

import java.util.ArrayList;

public class ExternalClass {
	
	public static void main (String args[]){
		
		ABreedingClass breed;
		ArrayList arl = new ArrayList();
		
		//Step 6.a - Acquire the instance	
		InstantiatorClass instantiator = InstantiatorClass.getInstance();
		
		//Here we instantiate a thousand objects of this object and check what happens to the memory
		AIntrinsicDataClass intrinsic = null;
		for(int i = 0; i < 1000; i++){
			if(i <501){
				//Step 6.b - time has come to use the pattern, for we are instantiating an object of the breeding class. 
				//Step 6.b.i - instead of invoking new we obtain it from the instantiator
				intrinsic = instantiator.obtain("1", "1");
				
				//Step 6.ii - pass the object to the constructor of ABreedingClass, thus the intrinsic data are not created afresh but we reuse them.
				breed = new ABreedingClass(intrinsic, String.valueOf(i+1), String.valueOf(i+2));
			} else {
				intrinsic = instantiator.obtain("2", "2");
				breed = new ABreedingClass(intrinsic, String.valueOf(i+1), String.valueOf(i+2));
			}
			arl.add(breed);
		}
		
		try {
			//Sleep for some time for me to capture the dump
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
