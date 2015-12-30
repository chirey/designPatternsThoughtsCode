package com.behavioural.template;

//Step 2 - identifying the class which have methods parts of which change, the method is methodA,
//Step 3.d.iv - making the base abstract
public abstract class AClass {
	
	//Step 2c - this will be used by external system
	public String methodA(String var){
		
		
		//Step 3.d.i and 3.d.ii - uses and know the sequence of usage
		String out1 = methodA1(var);
		String out2 = methodA2(out1);
		String out3 = methodA3(out2);
		String out4 = methodA4(out3);
		String out5 = methodA5(out4);
		
		return out5;
	}

	public abstract String methodA1(String var);
	public abstract String methodA2(String var);
	public abstract String methodA4(String var);
	public abstract String methodA5(String var);
	
	//Step 3.d.iv - some methods are implementd, methodA3
	public String methodA3(String var) {
		
		String output = "adding output of methodA3 with " + var;
		
		return output;		
		
	}
	

}
