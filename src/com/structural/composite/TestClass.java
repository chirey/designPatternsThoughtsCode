package com.structural.composite;

public class TestClass {

	public static void main (String args[]){
		ExternalClass ecObject = new ExternalClass();
		
		AClass aObject = new AClass();
		BClass bObject = new BClass();
		CClass cObject = new CClass();
		
		ecObject.setaObject(aObject);
		ecObject.setbObject(bObject);
		ecObject.setcObject(cObject);
	
		ecObject.invokeMethods();
		
	}
}
