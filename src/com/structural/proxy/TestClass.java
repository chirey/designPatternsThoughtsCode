package com.structural.proxy;

public class TestClass {

	public static void main (String args[]){
		ExternalClass ec = new ExternalClass();
		OriginalProxyClass proxy = new OriginalProxyClass();
		ec.setObject(proxy);
		ec.doSomething();
	}
}
