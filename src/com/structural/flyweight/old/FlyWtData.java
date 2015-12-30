package com.structural.flyweight.old;

public class FlyWtData implements FlyWtI{
	
	//Remains Constant
	String e1;
	String e2;
	public void setE2(String e2) {
		this.e2 = e2;
	}
	@Override
	public String getE1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getE2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setE1(String e1) {
		this.e1 = e1;
	}

	public FlyWtData(String a, String b) {
		System.out.println("Creating new data");
		e1 = a;
		e2 = b;
	}
}
