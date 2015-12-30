package com.behavioural.observer;

import com.behavioural.observer.observerclasses.ObserverAClass;
import com.behavioural.observer.observerclasses.ObserverBClass;
import com.behavioural.observer.observerclasses.ObserverCClass;

public class ExternalSystemClass {
	public static void main (String args[]){
		
		//Step 6.a - Create different subject whose data shall change.
		SubjectOrObservedClass sub = new SubjectOrObservedClass();
		SubjectOrObservedClass sub2 = new SubjectOrObservedClass();
		
		//Step 6.b - Create different observers who will listen to changes in SubjectOrObservedClass.
		ObserverAClass obsA = new ObserverAClass();
		ObserverBClass obsB = new ObserverBClass();
		ObserverCClass obsC = new ObserverCClass();

		
		//Stpe 6.c Attach the subjects to their observers
		sub.getList().addObserver(obsA);  
		sub.getList().addObserver(obsB);
		
		//Stpe 6.c Attaching a different observer to sub2
		sub2.getList().addObserver(obsC);

		
		System.out.println("The object "+ sub + "is being observed by A and B");
		System.out.println("The object "+ sub2 + "is being observed by C ");
		
		// triggering the event. 
		// here the trigger is on function call
		
		sub.setName("X");
		sub.setName("Y");
	
		// triggering the event explicitly
		System.out.println("Explicity notifying observers of object " + sub);
		sub.notifyObservers();
		
		// triggering the event for sub2 object
		sub2.setName("B");
				
		
		
		
		
		
		
		
		
		
	}

}
