package com.behavioural.state;

public class ExternalSystemClass
{
	public static void main (String args[]){
		//Step 6 - instiatate and use AClass
		AClass aObject = new AClass();
		
		//Step 6.a - change the value
		//Step 6.b - invoke the method, the method will be different with different values and we are not using if-else loop within the method 	
		aObject.setVarA("1");
		aObject.methodX();
		
		aObject.setVarA("2");
		aObject.methodX();
		 
		aObject.setVarA("1");
		aObject.methodX();
		
	}
	
}
