package com.behavioural.mediator.after;

import com.behavioural.mediator.after.pattern.InOutClass;
import com.behavioural.mediator.after.pattern.MediatorClass;

//Step 6.e - Doing the same for other classes. 
public class BClass
{

    // Cleanup, the moment we do this it will flag up all areas where we require to change the code.
    // private DClass dObject;

    // Step 6.a - Define the mediator
    private MediatorClass mediatorObject;

    
    public int b1method(String strVar)
    {

        float fTemp;

        // cleanup
        // dObject = new DClass();

        // Remove this direct call and use mediator instead
        // fTemp = dObject.d1method(input);

        // Step 6.c.1 - create the input object.
        InOutClass input = new InOutClass();

        input.setStrVar(strVar);

        // Step 6.c.ii and iii - Delegate the call.
        
        // Step 6.a - Acquire the mediator prior to use and delegate the call
        mediatorObject = new MediatorClass();
        InOutClass output = mediatorObject.dmethod(input);

        // Step 6.c.iv - Obtain the output from within the input output class.
        fTemp = output.getFloatVar();

        // We keep these as this was part of the original function
        System.out.println("In method b1method trimming float to int");

        // Reuse transformation capabilities of input output class.
        return input.convertFloatToInt(fTemp);
    }
    
    // Step 6.b - Instantiate or acquire it.
    public void setMediatorObject(MediatorClass mediatorObject)
    {
        this.mediatorObject = mediatorObject;
    }
}
