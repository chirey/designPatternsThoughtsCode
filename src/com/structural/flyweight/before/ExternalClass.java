package com.structural.flyweight.before;

import java.util.ArrayList;

public class ExternalClass {
	
	public static void main (String args[]){
		
		ABreedingClass breed;
		ArrayList arl = new ArrayList();
		//Here we instantiate a thousand objects of this object and check what happens to the memory
		for(int i = 0; i < 1000; i++){
			if(i <501){
				
				breed = new ABreedingClass("1", "1", String.valueOf(i+1), String.valueOf(i+2));
			} else {
				breed = new ABreedingClass("2", "2", String.valueOf(i+1), String.valueOf(i+2));
			}
			arl.add(breed);
		}
		
		try {
			//Sleep for some time for me to capture the dump
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
