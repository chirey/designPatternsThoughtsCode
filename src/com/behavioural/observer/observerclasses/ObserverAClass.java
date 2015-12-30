package com.behavioural.observer.observerclasses;

import com.behavioural.observer.ObserverInterface;




//Step 3 - all observers implement the ObserverInterface
public class ObserverAClass implements ObserverInterface{

     
    
    //Step 1.a - implement the update method.
    @Override
    public void update() {
        System.out.println("I am observer A and have been notified");
        
    }

}
