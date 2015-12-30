package com.behavioural.memento;

import java.util.ArrayList;

//Step 4 - this is the Caretaker class 
public class CaretakerOrMementoManagerClass
{
    //Step 4a - a collection of mementoes, we can use generics here.
    ArrayList arl = new ArrayList<Object>();

    //Step 4.b.i - add to collection
    public void addToCollection(Object obj)
    {
        arl.add(obj);

    }

    //Step 4.b.ii - retrieve from the collection
    public Object retrieveFromCollection()
    {
        int r = arl.size() - 1;
        if (r < 0)
            return null;
        else
        {
            Object temp = arl.remove(r);
            return temp;
        }
    }

}
