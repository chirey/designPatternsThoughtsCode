package com.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Step 4 - ArrayList cannot be modified hence we are going the custom route.
// Here we create an external iterator (a class separate from the collection)
// pass it a collection and 
// implement the required navigational methods
public class ConcreteIteratorClass implements CustomIteratorInterface{
	
	private ArrayList<String> arl;
	Iterator<String> iter;
	
	public ConcreteIteratorClass(ArrayList<String> arlVar) {
		arl = arlVar;
		iter = arl.iterator();
	}
	
	
	@Override
	public boolean hasNext() {
		return iter.hasNext();
	}

	@Override
	public String getNext() {
		return iter.next();
	}

	@Override
	public String getSecondNext() {
		//Ignore the current item
		iter.next();
		return iter.next();
	}
	
}
