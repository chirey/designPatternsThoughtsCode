package com.creational.protoype.simpleVersion;

//Step 1 - Identify the class whose creating is a challenge
//Step 2 - Ascertain if you can copy objects rather than creating them afresh
//Step 3 - If copying makes sense, implement Cloneable
public class APrototypeClass implements Cloneable{
	
	private String variableA;
	
	private String strVarB;
	
	private String strVarC;

	public APrototypeClass(String varA, String varB, String varC) {
		
		this.variableA = varA;
		this.strVarB = varB;
		this.strVarC = varC;
		System.out.println("APrototypeClass.java - A new object of APrototypeClass class has been requested. Its id is " + this.hashCode() + "value of varA="+ varA);
	}
	
	public String getVariableA() {
		return variableA;
	}

	public void setVariableA(String variableA) {
		this.variableA = variableA;
	}

	public String getStrVarB() {
		return strVarB;
	}

	public void setStrVarB(String strVarB) {
		this.strVarB = strVarB;
	}
	
	

	public String getStrVarC() {
		return strVarC;
	}

	public void setStrVarC(String strVarC) {
		this.strVarC = strVarC;
	}

	//Step 4 - override the clone method, decide if you require shallow or deep clone.
	//Access modifier is made public as it is being used in the PrototypeMangerClass which is there in a separate package
	@Override
	public Object clone() throws CloneNotSupportedException {
		//Step 4a - avoid creating a new object here, it defeats the purpose
			return super.clone();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n variableA = " + variableA);
		sb.append("\n strVarB = " + strVarB);
		sb.append("\n strVarC = " + strVarC);
		return sb.toString();
	}
}
