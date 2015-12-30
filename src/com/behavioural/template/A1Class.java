package com.behavioural.template;

//Step 4 - forming the concrete classes
public class A1Class extends AClass {

	//Step 4.a override the necessary class
	@Override
	public String methodA1(String var) {
	String output = "adding output of A1Class.methodA1() with " + var;
	return output;		
	}

	@Override
	public String methodA2(String var) {
		String output = "adding output of A1Class.methodA2() with " + var;
		return output;
	}

	@Override
	public String methodA4(String var) {
		String output = "adding output of A1Class.methodA4() with " + var;
		return output;
	}

	@Override
	public String methodA5(String var) {
		String output = "adding output of A1Class.methodA5() with " + var;
		return output;
	}

}
