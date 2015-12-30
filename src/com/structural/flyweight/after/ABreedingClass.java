package com.structural.flyweight.after;

//Step 1 - Identified that objects of ABreedingClass is taking up much of heap space. 
//Step 2 - Identified that var1, var2 are mostly common within its objects, rest varies.
public class ABreedingClass {

	// Step 4a - change the class, remove the intrinsic variables and use the
	// AIntrinsicDataClass as we have moved the variables to AIntrinsicDataClass
	/*
	 * private String var1;
	 * 
	 * private String var2;
	 */
	
	//Step 4.e - usage of extrinsic variables stays the same
	private String var3;

	private String var4;

	// Step 4b create the intrisic class variable
	private AIntrinsicDataClass intrinsic;

	// Step 4.c we use the constructor to initialize the instrinsic variable
	public ABreedingClass(AIntrinsicDataClass intrinsic, String var3,
			String var4) {
		// Step 4a - all these code have gets removed as the variables are not
		// there
		// this.var1 = var1;
		// this.var2 = var2;
		this.intrinsic = intrinsic;
		this.var3 = var3;
		this.var4 = var4;
	}

	//Step 4a - all these code have gets removed as the variables are not there
	/*
	 * public String getVar1() { return var1; }
	 * 
	 * public void setVar1(String var1) { this.var1 = var1; }
	 * 
	 * public String getVar2() { return var2; }
	 * 
	 * public void setVar2(String var2) { this.var2 = var2; }
	 */

	public String getVar3() {
		return var3;
	}

	public void setVar3(String var3) {
		this.var3 = var3;
	}

	public String getVar4() {
		return var4;
	}

	public void setVar4(String var4) {
		this.var4 = var4;
	}
	
	
	public void methodP(){
		//Step 4.d to use var1 and var2 we use the getters of intrinsic object
		System.out.println("ABreedingObject.java " + intrinsic.getVar1());
	}

}
