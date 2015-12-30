package com.creational.protoype.simpleVersion;
//Step 6a - this is the ExternalClass but does not use a PrototypeManager
public class ExternalClassWithoutPrototypeManager {
	
	public static void main (String args[]){
		
		//The class requires to be imported.
		APrototypeClass aPrototypeObject;
		
		//Step 6b - it creates one object
		//No harm in invoking new few times.
		aPrototypeObject = new APrototypeClass("v1", "v2", "v3");
		printInfo(aPrototypeObject);
		
		
		System.out.println("We shall now create other aPrototypeObject without involving new");
		APrototypeClass aPrototypeObject2;
		APrototypeClass aPrototypeObject3;
		
		try {
			//Step 6c - clone and then typecast to obtain the new object
			//Step 6d - clone will throw exception hence we have to enclose it in try-catch block or throw it
			aPrototypeObject2 = (APrototypeClass) aPrototypeObject.clone();
			
			//Step 6e - initialize the state as per the current situation. Here we assume we change only the state variables
			aPrototypeObject2.setVariableA("2");
			//Step 6f - initialize the non state variables , we set them to null.
			aPrototypeObject2.setStrVarB(null);
			aPrototypeObject2.setStrVarC(null);
			
			//Step 7 - Similarly repeat steps to obtain another object 
			aPrototypeObject3 = (APrototypeClass) aPrototypeObject.clone();
			aPrototypeObject3.setVariableA("3");
			
			//We print the info for testing
			printInfo(aPrototypeObject2);
			printInfo(aPrototypeObject3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

	private static void printInfo(APrototypeClass aPrototypeObject) {
		System.out.println("ExternalClassWithoutPrototypeManager.java - The aPrototypeObject object is received. "
				+ "It's id is " + aPrototypeObject.hashCode() + " and has the following values" + aPrototypeObject);
		
	}
}
