package com.behavioural.strategy;

//Step 1 - Identifying the AClass
//Step 3c - AClass does not implement A1Interface or B1Interface
public class AClass {
	
	//Step 3a - Create the interface variables
	A1Interface a1;
	
	B1Interface b1;
	
	//Step 1 - methodA changes the logic based on situation
	public void methodA(){
		//Step 3d - delegate the call to a1 variable
		//since there is not to pass or return we just call the method
		a1.methodA();

	}

	//Step 1 - methodB changes the logic based on situation
	public String methodB(String input){
		//Step 3d - delegate the call to a1 variable
		String output = b1.methodB(input);
		return output;	
	}

	//Step 3b - setter for a1 interface variable
	public void setA1(A1Interface a1) {
		this.a1 = a1;
	}
	//Step 3b - setter for b1 interface variable
	public void setB1(B1Interface b1) {
		this.b1 = b1;
	}
}
