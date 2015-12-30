package com.structural.composite;

//Step 2 - Creation of the interface
public interface ACommonInterface {

	public abstract String methodA(String var);

	//Step 4a - Added the exception to method signature
	public abstract String methodC(String var) throws ContextException;

	public abstract String methodB(String var) throws ContextException;

}