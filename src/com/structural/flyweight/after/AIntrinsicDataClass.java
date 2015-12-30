package com.structural.flyweight.after;

//Step 2 - created the class holding the intrinsic variables.
public class AIntrinsicDataClass {

	//Create the intrinsic variables, they are exacltly same as the intrinsic variables of the breeding class
	private String var1;

	private String var2;

	public AIntrinsicDataClass(String var12, String var22) {
		this.var1 = var12;
		this.var2 = var22;
	}

	//Step 3b - getters and setters for these variables
	public String getVar1() {
		return var1;
	}

	public void setVar1(String var1) {
		this.var1 = var1;
	}

	public String getVar2() {
		return var2;
	}

	public void setVar2(String var2) {
		this.var2 = var2;
	}

	//Step 3.c - the getKey method, it should take all the intrinsic variables and give the key. The type of key can be anything relevant int he design. 
	// the logic within the method is such that the output uniquely identifies the variables.
	//Step 3.d - make it static
	public static String getKey(String var1, String var2) {
		return var1 + var2;
	}

}
