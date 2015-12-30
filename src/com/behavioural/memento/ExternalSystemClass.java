package com.behavioural.memento;

import com.behavioural.memento.OriginatorEmployeeClass.Memento;

public class ExternalSystemClass {
	
	public static void main (String args[]){
		
		//Step 5.a - create a manager(s)
		CaretakerOrMementoManagerClass mm1 = new CaretakerOrMementoManagerClass();
		CaretakerOrMementoManagerClass mm2 = new CaretakerOrMementoManagerClass();
		
		//Step 5.b - obtain the originator classes - we create it here for simplicity.
        OriginatorEmployeeClass emp1 = new OriginatorEmployeeClass("P1", "HR");
        OriginatorEmployeeClass emp2 = new OriginatorEmployeeClass("P2", "IT");
        
		
		
		//This code is to incorporate some dummy data
        emp1.setId(1);
        emp1.setName("James Bond");
        emp1.setDesig("junior1");
		
		//When ever we require to store state, in this case when ever there is a promotion, change in desig we store it. 
		//Step 5.c.i - obtain a memento - emp1.retrieve()
		//Step 5.c.ii - store it in the collection
		mm1.addToCollection(emp1.retrieve());

		//More code to do the same thing
		emp2.setId(2);
        emp2.setName("Joe Berg");
		emp2.setDesig("mid1");
		mm2.addToCollection(emp2.retrieve());
		
		emp1.setDesig("junior2");
		mm1.addToCollection(emp1.retrieve());
		
		emp1.setDesig("junior3");
		mm1.addToCollection(emp1.retrieve());
		
		emp2.setDesig("mid2");
		mm2.addToCollection(emp2.retrieve());
		
		emp1.setDesig("junior4");
		mm1.addToCollection(emp1.retrieve());
		
		//Step 5.d.i - retrieve the memento
		//Step 5.d.ii - restore the originator 
		emp1.restore((Memento) mm1.retrieveFromCollection());
		System.out.println("ExternalSystemClass.java : temp.desig  - " + emp1.getDesig());
		System.out.println("ExternalSystemClass.java : temp.id  - " + emp1.getId());
		
		emp1.restore((Memento) mm1.retrieveFromCollection());
		System.out.println("\n\nExternalSystemClass.java : temp.desig  - " + emp1.getDesig());
	    System.out.println("ExternalSystemClass.java : temp.id  - " + emp1.getId());
		
	}

}
