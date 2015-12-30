package com.behavioural.memento;


import java.util.ArrayList;

//Step 1 - this is our Originator Class
//Step 3.a implements MementoInterface
public class OriginatorEmployeeClass implements MementoInterface{
	
    //Step 1 - Decide which are state variables
    // id, name, desig are taken as state variables. We assume from desig using some map we can arrive at what is the salary and which department the person belongs to.
	private int id;
	private String name;
	private String department;
	private String salary; 
	private String desig;
	
	private Memento mem;
	
	public OriginatorEmployeeClass( String name1, String department1) {
		name = name1;
		department = department1;
	
		
	}
	

	
	
	//Step 2.b - Make this an inner class
	public class Memento {

	    //Step 2a - encapsulate the state variables
	    //Step 2.c - make it all private
		private String name1, desig1; int id1;
		
		//Step 2.e the constructor 
		public Memento(String name11, String desig11, int id11){
			name1 = name11;
			desig1 = desig11;
			id1 = id11;
		}
		
		//Step 2.d - Remove any getters and setters

	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
	
		this.desig = desig;
		
	}


	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}


	//Step 3.b.i - restores current object with the values from the memento object
	public void restore(Object obj) {
		Memento memento = (Memento) obj;
		
		//Step 3.b.ii.1.a - restoring values
		this.name = memento.name1;
		this.desig = memento.desig1;
		this.id = memento.id1;
		
		//Step 3.b.ii.1.b - restore the other variables using map or set them to default. We for simplicity set it to null.
		this.department = null;
		this.salary = null;
		
	}

	//Step 3.b.i - gives the caller a memento object
	public Object retrieve() {
		return new Memento(name, desig, id);
	}


}
