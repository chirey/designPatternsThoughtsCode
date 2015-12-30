package com.behavioural.visitor;

//Step 1.c.i - implement the VistorFrameworkInterface
public class AExistingClass implements VistorFrameworkInterface{
	
	private String variableA = null;
	
	public void methodA(){
		System.out.println("Function A of Class A");
	}

	//Step 1.c.ii - ii.	Implement the accept() method.
	@Override
	public void accept(VisitorInterface f) {
		//Step 1.c.iii.	The call to execute(). Pass "this" reference
		f.execute(this);
		
	}

	//Step 1.c.iv.	Create appropriate getters for required variables.  
	public String getVariableA() {
		return variableA;
	}

	
	public void setVariableA(String variableA) {
		this.variableA = variableA;
	}
	
	

}
