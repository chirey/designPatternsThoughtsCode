package com.structural.flyweight.after;

import java.util.HashMap;

public class InstantiatorClass {
	//Step 5.a - Making the class singleton
	private static InstantiatorClass instance = null;

	//Step 5.a - Making the class singleton
	private InstantiatorClass() {
		map = new HashMap();
	}

	//Step 5.a - Making the class singleton
	public static InstantiatorClass getInstance() {
		if (instance == null) {
			instance = new InstantiatorClass();
		}
		return instance;
	}

	//Step 5.b - create the collection
	private HashMap map;

	
	//Step 5.c - removing the getter and setter for the collection, other classes should not require this object
	/*
	 * public HashMap getMap() { return map; } public void setMap(HashMap map) {
	 * this.map = map; }
	 */

	//Step 5.d - the obtain methods, for a BreedingClass it takes the intrinsic values of the class as inputs, and gives back the intrinsic object.
	//Step 5.d.i - Note that it takes intrinsic values directly and not any aIntrinsicObject, as we require to cut down the creation of the aIntrinsicObject 
	public AIntrinsicDataClass obtain(String var1, String var2) {
		//Step 5.d.ii - obtain the Key for these variables, use the static method getKey
		String key = AIntrinsicDataClass.getKey(var1, var2);
		
		//Place holder for our object to be returned.
		AIntrinsicDataClass aIntrinsicDataObject = null;
		
		//Step 5.d.iii - find the intrinsic object inthe collection
		if (map.containsKey(key)) {
			aIntrinsicDataObject = (AIntrinsicDataClass) map.get(key);
		} else {
			//Step 5.d.iii.2.a - if not found create a new one. 
			aIntrinsicDataObject = new AIntrinsicDataClass(var1, var2);
			
			//Step 5.d.iii.2.b - store the object
			map.put(key, aIntrinsicDataObject);
		}
		
		//Step 5.d.iv - Return the intrinsic object
		return aIntrinsicDataObject;
	}
	
	//Step 5.e - other obtain methods - create other intrinsic class, name it properly, create proper collection, name the obtain method appropriately to signify which collection it works upon. 
}
