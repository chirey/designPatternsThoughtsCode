package com.behavioural.mediator.after.pattern;

// Step 4.d - decide the input and output classes
// here we see that the input and output are fairly straight forward and can be done with a single class itself.
// Within this class we use the primitives that are being used by the variables.
// Note we are reusing InOutClass for both input and output
public class InOutClass {
	
	private String strVar;
	
	private float floatVar;
	
	private int intVar;

	public String getStrVar() {
		return strVar;
	}

	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}

	public float getFloatVar() {
		return floatVar;
	}

	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}

	public int getIntVar() {
		return intVar;
	}

	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	
	//Step 5.c - create transformations as required.
	public int convertFloatToInt(float var) {
		return (int) var;
	}
	

}
