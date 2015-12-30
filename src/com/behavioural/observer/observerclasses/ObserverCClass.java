package com.behavioural.observer.observerclasses;

import com.behavioural.observer.ObserverInterface;

public class ObserverCClass implements ObserverInterface{

	 
	
	@Override
	public void update() {
		System.out.println("I am observer C and have been notified");
		
	}

}
