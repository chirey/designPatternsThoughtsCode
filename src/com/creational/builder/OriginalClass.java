package com.creational.builder;

//Step1 - identify the class which has multiple variables and multiple constructors

public class OriginalClass {
	
	private String var1;
	
	private String var2;
	
	private String var3;
	
	private String var4;
	
	private String var5DependentOnVar1;

	//Step 2 - removing all constructors
/**
	//Creating originalObject type A whose v1, v2 and v5 (derived from v1) is only initialized
	public OriginalClass(String v1, String v2){
		this.var1 = v1;
		//This code intializes v5 based on v1
		this.var5DependentOnVar1 = getValueOfV5(var1);
		
		this.var2 = v2;
		
		
		
	}
	
	

	public OriginalClass(String v1, String v2, String v4){
		this.var1 = v1;
		//This code intializes v5 based on v1
		this.var5DependentOnVar1 = getValueOfV5(var1);

		this.var2 = v2;
		this.var4 = v4;
	}
	
	public OriginalClass(String v1){
		this.var1 = v1;
		//This code intializes v5 based on v1
		this.var5DependentOnVar1 = getValueOfV5(var1);

	}
	*/
	
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

	public String getVar5DependentOnVar1() {
		return var5DependentOnVar1;
	}

	public void setVar5DependentOnVar1(String var5DependentOnVar1) {
		this.var5DependentOnVar1 = var5DependentOnVar1;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nvar1 = " + var1);
		sb.append("\nvar2 = " + var2);
		sb.append("\nvar3 = " + var3);
		sb.append("\nvar4 = " + var4);
		sb.append("\nvar5DependentOnVar1 = " + var5DependentOnVar1);
		return sb.toString();
	}
	
	//Logic for assigning the value of v5 based on v1
	public String getValueOfV5(String v1) {
		String output = null;
		if (v1 != null){
			output = null;
		} else {
			output = "default value";
		}
		return output;
	}
	

}
