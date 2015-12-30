package com.behavioural.template;

public class TestClass {
	
	
	//Step 5.b - This test class is created to pass NewSituationExternalClass a proper concrete class
	public static void main (String args[]){
		ExternalClass ec = new ExternalClass();
		A1Class ac1 = new A1Class();
		
		ec.setaObject(ac1);
		ec.doTask();
		
	}

}
