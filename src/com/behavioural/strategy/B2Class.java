package com.behavioural.strategy;

//Step 2b - Creating the B2Class or strategy classes FOR B1Interface
public class B2Class implements B1Interface{

	//Step 2b - the logic within the method is different from that in B1Class
	public String methodB(String str) {
		//ignoring str 
		String strA = "In B2Class.methodB() - logic B2 is used here";
		System.out.println(strA + " input string is " + str);
		return strA;
	}

}
