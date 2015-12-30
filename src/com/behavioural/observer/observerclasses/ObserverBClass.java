package com.behavioural.observer.observerclasses;

import com.behavioural.observer.ObserverInterface;

public class ObserverBClass implements ObserverInterface{

	 
	
	@Override
	public void update() {
		System.out.println("I am observer B and have been notified");
		
	}

}
