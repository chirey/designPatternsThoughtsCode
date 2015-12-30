package com.behavioural.state;


public class AClass 
{
    //Step 4a - the composition
	private StateInterface stateObj;
	
    private String varA;
    
    private String varB;
    
    private String varC;

    public void methodX(){
    	//Step 5b - delegate the call to the state object
        stateObj.methodX();
        
    }
    
    public void methodY(){
    	//Step 5b - delegate the call to the state object
    	stateObj.methodY();
    }
    
    public void methodZ(){
        System.out.println("this is the default logic of z");
    }


    public String getVarA()
    {
        return varA;
    }

    //Step 5a - the swapping of the state
    public void setVarA(String varA)
    {
        this.varA = varA;
        
        if(varA.equals("1"))
        	stateObj = new A1Class();
        else if (varA.equals("2"))
        	stateObj = new A2Class();
        else
        	; // do nothign, let the last state remain
        	 
    }

    public String getVarB()
    {
        return varB;
    }

    public void setVarB(String varB)
    {
        this.varB = varB;
    }

    public String getVarC()
    {
        return varC;
    }

    public void setVarC(String varC)
    {
        this.varC = varC;
    }

    //Step 4b - the setter for the state variable
	public void setStateObj(StateInterface stateObj) {
		this.stateObj = stateObj;
	}
    
    
    
}
