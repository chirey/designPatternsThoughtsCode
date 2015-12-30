package com.creational.singleton.external;

import com.creational.singleton.pattern.ASingletonClass;

/** 
 * 
 * @author Mak
 * This class serves to be a program which can be run and is used for test purpose 
 * So it has the main method. 
 */
public class TestClass {
	
	public static void main(String args[]) {
		
		System.out.println("TestClass.java : The idea is to instatiate multipe ExternalClass and obtain the id of externalObject and the singletonObject that externalObject creates");
		ExternalClass ec1 = new ExternalClass();
		ec1.printInfo();
		
		System.out.println("TestClass.java : Within same thread we instantiate ExternalClass once again");
		ExternalClass ec2 = new ExternalClass();
		ec2.printInfo();

		System.out.println("TestClass.java : We obtain an instance of the ASingletonClass directly");
		
		//We now use the singleton directly here
		// So now ExternalClass is both the user of the Singleton class in additon to being a executatble program.
		ASingletonClass sc = ASingletonClass.getInstance();
		System.out.println("TestClass.java : The id of the singleton is - " + sc.hashCode());
		
		//How to make sure it works
		System.out.println("TestClass.java : It is behaving as a Singleton if the all the id's of the aSingletonObject are the same");
	}

}
