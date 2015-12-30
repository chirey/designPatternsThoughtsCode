package com.structural.facade.external;

import com.structural.facade.pattern.AClass;
import com.structural.facade.pattern.BClass;
import com.structural.facade.pattern.CClass;

//Step1 - This was our previous external class.
public class PreviousExternalClass {
	
	public static void main (String args[]){
		
		//Step 1.a - Acquire the classes
		AClass aObject = new AClass();
		BClass bObject = new BClass();
		CClass cObject = new CClass();
		
		//Step 1.c - calls many methods of the classes directly
		aObject.methodA1(null);
		aObject.methodA2(1);
		bObject.methodB3(null, 1);
		cObject.methodC2(null);
		
		//Step 1.d - we find a method chain.
		String str = aObject.methodA1(null);
		double value = cObject.methodC2(str);
				
		//Step 2 - We identify methodA1, methodA2, methodB3 and the methodC2 are the candidates.
		
		
		
		
		
	}

}
