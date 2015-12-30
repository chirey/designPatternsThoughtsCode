package com.behavioural.strategy;

//Step 1 - this the external class
public class ExternalClass {
	
	public static void main (String args[]){
		//Step 4a - create the right behaviour, 
		//Based on context NewSituationExternalClass assertains that A1Class and B2Class would be the strategy to be followed
		A1Class a1 = new A1Class();
		B2Class b2 = new B2Class();
		
		//Step 4b - pass the right strategy to AClass
		AClass a = new AClass();
		a.setA1(a1);
		a.setB1(b2);
		
		//Step 4c - use the methods 
		a.methodA();
		String output = a.methodB("test");
		
		
		
		
		
	}
}
