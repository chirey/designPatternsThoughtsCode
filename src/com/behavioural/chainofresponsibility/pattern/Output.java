package com.behavioural.chainofresponsibility.pattern;

//Step 2 - We encapsulate the response, if the response object is trivial we need not encapsulate it and use primitives or existing objects or keep it just void depending uponn context
// Note we are calling this the Output object as this will be the output type for the handler method
public class Output {
	
	private String strVarB;

	// We have to get data in and out of the object, hence the following setter and getter
	public String getStrVarB() {
		return strVarB;
	}

	public void setStrVarB(String strVarB) {
		this.strVarB = strVarB;
	}
	
	

}
