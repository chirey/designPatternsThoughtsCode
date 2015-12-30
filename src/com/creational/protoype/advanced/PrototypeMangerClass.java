package com.creational.protoype.advanced;

import java.util.HashMap;

import com.creational.protoype.simpleVersion.APrototypeClass;

//Step 5 - Create a prototype manager class to optimise creation
public class PrototypeMangerClass {
	
	//Step 5a - create a collection to store the objects
	private HashMap<String, APrototypeClass> hMap;
	
	//The class requires to be imported.
	APrototypeClass aPrototypeObject;
	
	//To initialize the hMap
	public PrototypeMangerClass() {
		hMap = new HashMap<String, APrototypeClass>();
	}
	
	public 	APrototypeClass obtain(String arg){
		APrototypeClass aPrototypeObject;
		
		//Step 5b - decide on the identity using which the objects would be retrieved and store in the collection.
		aPrototypeObject = objectExistsInCollection(arg);
		if (aPrototypeObject != null){
			//Step 5d -  if prototype is found then that is used
			;
			
		} else {
			//Step 5e - if prototype is not found , we instantiate a new object 
			aPrototypeObject = new APrototypeClass(arg, null, null);
			//Step 5.e.i - store it in the collection for future use
			hMap.put(arg, aPrototypeObject);
		}
		return aPrototypeObject;
	}

	//Step 5b - decide the identity based on which we store the collection.
	//In this case we decide to store the object based on the first argument
	private APrototypeClass objectExistsInCollection(String arg) {
		return hMap.get(arg);
	}
	

}
