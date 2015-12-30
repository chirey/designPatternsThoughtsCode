package com.behavioural.template;

//Step 1 - identify the external class
public class ExternalClass {

	AClass aObject;
	
	//Step 5.a.ii we do not want the External Class to know the concrete class.
	//Step 5.b - know the concrete class by the base class
	public void setaObject(AClass aObject) {
		this.aObject = aObject;
	}

	public void doTask() {
		String input = "Test Input";
		System.out.println("Input is \n" + input);
		//Step 5.a.iv.
		String output = aObject.methodA(input);
		System.out.println("Output is \n" + output );
		
	}
	
	
}
