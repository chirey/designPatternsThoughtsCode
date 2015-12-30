package com.behavioural.chainofresponsibility.pattern;

//Step 1 - We encapsulate the request, if the request object is trivial we need not encapsulate it and use primitives or existing objects depending uponn context
// Note we are calling this the Input object as this will be the input type for the handler method
public class Input {
	
	private String strVarA;

	// We have to get data in and out of the object, hence the following setter and getter
	public String getStrVarA() {
		return strVarA;
	}

	public void setStrVarA(String strVarA) {
		this.strVarA = strVarA;
	}
	
	

}
