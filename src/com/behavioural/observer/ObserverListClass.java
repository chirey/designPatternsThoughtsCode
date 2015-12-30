package com.behavioural.observer;

import java.util.Vector;

//Step 2 - A collection to hold observers
public class ObserverListClass {
	
	private Vector observerList = new Vector();
	
	//Step 2.a add or remove from collection
	public void addObserver(ObserverInterface o) {
		observerList.add(o);
	}
 
    //Step 2.a add or remove from collection
	public void deleteObserver(ObserverInterface o){
		observerList.remove(o);
		
	}

	// Step 2.b call the notification method of the observers
	public void notifyObservers() {

		 for (Object object : observerList) {
			 ObserverInterface x = (ObserverInterface) object;
			 x.update();
			
		}
		
	}
	

}
