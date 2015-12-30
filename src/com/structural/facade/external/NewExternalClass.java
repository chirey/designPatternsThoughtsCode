package com.structural.facade.external;

import com.structural.facade.pattern.FacadeClass;

//Step7 - This is our new external class.
public class NewExternalClass {

	public static void main(String args[]) {

		// Step 1.a - Acquire the classes, now it requires only one class the
		// So the number of classes imported also changes.
		// facade
		// AClass aObject = new AClass();
		// BClass bObject = new BClass();
		// CClass cObject = new CClass();
		FacadeClass facade = new FacadeClass();

		// Step 7.a - calls many methods of the facade
		facade.methodA1(null);
		facade.methodA2(1);
		facade.methodB3(null, 1);
		facade.methodC2(null);

		// Step 7.b - we find a method chain.
		String str = facade.methodA1(null);
		double value = facade.methodC2(str);
		//Code to use the value
	}

}
