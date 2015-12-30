package com.creational.builder;

public class ExternalClass {
	
	public static void main (String args[]){
		
		/**
		 * Old way of instantiating the class
		 * 
		 */
		/*
		OriginalClass originalObject = new OriginalClass("v1 value", "v2 value");
		//Simple logic to print the values of the object
		System.out.println("originalObject identified by hash" + originalObject.hashCode() +" has values "  + originalObject );
		*/
		
		
		//Step 5a - the new way of getting Original Object initialized. Obtain a builder class.
		ABuilderClass builder = new ABuilderClass();
		
		//We create a placeholder for the object we are trying to build.
		OriginalClass originalObject = null;
		
		try {
			//Step 5b - call only those methods (using method chaining) of builderObject that are required to initialize the object.
			// In this case we (say) var2, var3 does not matter so does not require initialization
			//Step 5c - finally call the build method
			originalObject = builder.setVar1("v1 value").setVar4("v4 value").build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("originalObject identified by hash" + originalObject.hashCode() +" has values "  + originalObject );
			
	}
	

}
