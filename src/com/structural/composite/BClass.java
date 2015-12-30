package com.structural.composite;

public class BClass implements ACommonInterface{

	@Override
	public String methodA(String var) {
		System.out.println("BClass.java: methodA is supported");
		return null;
	}

	@Override
	public String methodC(String var) {
		System.out.println("BClass.java: methodC is supported");
		return null;
	}

	//Step 6 - this method was originally not present in this class
	@Override
	public String methodB(String var) throws ContextException {
		System.out.println("BClass.java: methodB is not supported, throwing Context exception");
		throw new ContextException("methodB is not supported in BClass");
	}

}
