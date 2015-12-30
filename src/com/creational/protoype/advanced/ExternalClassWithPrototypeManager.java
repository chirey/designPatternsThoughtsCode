package com.creational.protoype.advanced;

import com.creational.protoype.simpleVersion.APrototypeClass;

//Step 6a - this is the ExternalClass but does not use a PrototypeManager
public class ExternalClassWithPrototypeManager {
	
	public static void main (String args[]){
		
		//The class requires to be imported.
		APrototypeClass aPrototypeObject;
		
		/** If prototype manager is used, even for the first time the PrototypeManger can be used as it has the responsibility of instantiating the class if not found.  
		//Step 6b - it creates one object
		//No harm in invoking new few times.
		aPrototypeObject = new APrototypeClass("v1", "v2", "v3");
		printInfo(aPrototypeObject);
		*/
		
		APrototypeClass aPrototypeObject1;
		APrototypeClass aPrototypeObject2;
		APrototypeClass aPrototypeObject3;
		APrototypeClass aPrototypeObject4;
		
		//Create or obtain the PrototypeManagerClass
		PrototypeMangerClass manager = new PrototypeMangerClass();
		
		try {
			//Step 6a - using obtain() get a prototypeObject
			aPrototypeObject1 = manager.obtain("1");
			//We print the info for testing
			printInfo(aPrototypeObject1);
			
			//Step 6c - clone the object
			aPrototypeObject2 = (APrototypeClass) aPrototypeObject1.clone();
			
			//Step 6e - initialize the state as per the current situation. Here we assume we change only the state variables
			aPrototypeObject2.setVariableA("2");
			//Step 6f - initialize the non state variables , we set them to null.
			aPrototypeObject2.setStrVarB("2");
			aPrototypeObject2.setStrVarC("2");
			
			//Step 7 - Similarly repeat steps to obtain another object 
			aPrototypeObject3 = manager.obtain("1");
			aPrototypeObject3 = (APrototypeClass) aPrototypeObject1.clone();
			aPrototypeObject3.setVariableA("3");
			aPrototypeObject3.setStrVarB("3");
			aPrototypeObject3.setStrVarC("3");
			
			//Step 7 - Similarly repeat steps to obtain another object 
			aPrototypeObject4 = manager.obtain("2"); //This object will not be found hence, new would be used
			aPrototypeObject4 = (APrototypeClass) aPrototypeObject1.clone();
			aPrototypeObject4.setVariableA("4");
			aPrototypeObject4.setStrVarB("4");
			aPrototypeObject4.setStrVarC("4");
			
			//We print the info for testing
			printInfo(aPrototypeObject2);
			printInfo(aPrototypeObject3);
			printInfo(aPrototypeObject4);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

	private static void printInfo(APrototypeClass aPrototypeObject) {
		System.out.println("ExternalClassWithoutPrototypeManager.java - The aPrototypeObject object is received. "
				+ "It's id is " + aPrototypeObject.hashCode() + " and has the following values" + aPrototypeObject);
		
	}
}
