package com.behavioural.observer;



//Step 4 and 4.b - all observed classes implement the Observable interface

public class SubjectOrObservedClass implements ObservableInterface{

	//Internal state of the subject
	private String name;
	
	
	
	//Step 4.a SubjectOrObservedClass maintains a list of observers.
	//Step 5.a - we keep non static so that the list is personal to individual objects
	private ObserverListClass list;
	
	
	//Step 4.a intialization using constructor
	public SubjectOrObservedClass() {
	    //Step 5.b - intializing the list
		list = new ObserverListClass();
	}
	
	
	//Step 3 - notify method
	@Override
	public void notifyObservers() {
	    //Step 3.a - delegate call to the ObserverList
		list.notifyObservers();
		
	}
	public ObserverListClass getList() {
		return list;
	}
	public String getName() {
		return name;
	}
	public void setName(String c) {
		
		this.name = c;
		System.out.println("Object " + this + " has changed, the value of name is " + name); System.out.flush();
		notifyObservers();
	}

	// A general function
	public void prindtCount(){
		System.out.println("the value of name " + name);
	}

	
	
	

}
