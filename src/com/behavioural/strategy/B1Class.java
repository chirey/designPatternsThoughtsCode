package com.behavioural.strategy;

//Step 2b - Creating the B1Class or strategy classes FOR B1Interface
public class B1Class implements B1Interface{

	//Step 2b - the logic within the method is different from that in B2Class
	public String methodB(String str) {
		//ignoring str 
		String strA = "In B1Class.methodB() - logic B1 is used here";
		System.out.println(strA + " input string is " + str);
		return strA;
	}

}
