package com.structural.composite;

public class CClass implements ACommonInterface{

	@Override
	public String methodA(String var) {
		System.out.println("CClass.java: methodA is supported");
		return null;
	}

	//Step 6 - this method was originally not present in this class
	@Override
	public String methodC(String var) throws ContextException{
		System.out.println("CClass.java: methodC is not supported, throwing Context exception");
		throw new ContextException("methodC is not supported in CClass");
	}

	@Override
	public String methodB(String var) {
		System.out.println("CClass.java: methodB is supported");
		return null;
	}
		
	
}
