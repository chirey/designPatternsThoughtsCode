package com.structural.bridge.pattern;

//Step 1.b - Identify that the methods in the subclasses which do similar tasks 
//Step 1.c - but the logic is different and based on the context 
	//We identified that a1ModelMethod, a2ModelMethod and b1ModelMethod were these methods. 
	//these methods were there in both ModelASubClass and ModelBSubClass but there logic were different.
//Step 1.e - We anticipate in future we would require more subclasses with about the same logic but bit different for a new situation in the context and so on.

//Step 2.c - after creating the base class we extend this class from base
public class ModelASubClass extends ModelOrAbstractionOrBaseClass{

	public void extraMethod(){
		System.out.println("ModelASubClass.java: An dummy extra method");
	}
	


}
