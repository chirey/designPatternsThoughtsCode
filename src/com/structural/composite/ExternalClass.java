package com.structural.composite;

public class ExternalClass {
	
	//Step 7.a - instantiate and use the object in the usual way
	private ACommonInterface aObject;
	private ACommonInterface bObject;
	private ACommonInterface cObject;

	public void invokeMethods() {
		//Step 7.a - instantiate and use the object in the usual way
		aObject.methodA(null);
		
		//Step 7.b - Handling of non supported operation
		try {
			aObject.methodB(null);
		} catch (ContextException e) {
			;// Handle exception
		}

		try {
			aObject.methodC(null);
		} catch (ContextException e) {
			;// Handle exception
		}

		bObject.methodA(null);
		
		try {
			bObject.methodB(null);
		} catch (ContextException e) {
			;// Handle exception
		}
		try {
			bObject.methodC(null);
		} catch (ContextException e) {
			;// Handle exception
		}

		cObject.methodA(null);
		
		try {
			cObject.methodB(null);
		} catch (ContextException e) {
			;// Handle exception
		}
		try {
			cObject.methodC(null);
		} catch (ContextException e) {
			;// Handle exception
		}

	}

	public ACommonInterface getaObject() {
		return aObject;
	}

	public void setaObject(ACommonInterface aObject) {
		this.aObject = aObject;
	}

	public ACommonInterface getbObject() {
		return bObject;
	}

	public void setbObject(ACommonInterface bObject) {
		this.bObject = bObject;
	}

	public ACommonInterface getcObject() {
		return cObject;
	}

	public void setcObject(ACommonInterface cObject) {
		this.cObject = cObject;
	}

}
