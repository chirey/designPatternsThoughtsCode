package com.structural.adapter.pattern;

/**
 * Note that this Adaptee class is kept in a separate package to 
 * 		emphasize that this may be a code that we cannot change or 
 * 		is available in a jar, in our project  
 *  
 * Step 1 - Identify the adaptee class whose methods are not exactly what is required.
 * @author Mak
 *
 */
public class AdapteeClass {

	//All this method does is to convert the number from STRING to a double
	public double actualMethodSignature(String newInput) {
		Double d = Double.parseDouble(newInput);
		return d.doubleValue();
	}


}
