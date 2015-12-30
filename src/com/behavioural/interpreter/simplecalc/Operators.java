/**
 * 
 */
package com.behavioural.interpreter.simplecalc;

import java.util.ArrayList;

//This is an additional class used to keep track of the multiple operator in our problem space.
public class Operators {

	public ArrayList<String> operators = new ArrayList<String>();

	public Operators() {
		operators.add("+");
		operators.add("-");
		operators.add("*");
		operators.add("/");
	}

	public boolean contains(String d) {
		for (String iter : operators) {
			if (d.equals(iter))
				return true;
		}
		return false;
	}
}
