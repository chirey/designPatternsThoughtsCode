package com.behavioural.interpreter.simplecalc;

//Step 9 - Creation of the terminal interpreter class. Here instead of creating multiple terminal expressions we have combined the classes. 
public class TerminalInterpreterClass extends InterpretorBaseClass {

	public TerminalInterpreterClass(String sign1) {
		sign = sign1;
	}

	@Override
	public void interpret() {
		leftOperand = getleft(c, sign);
		rightOperand = getright(c, sign);
		float a = Float.parseFloat(leftOperand);
		float b = Float.parseFloat(rightOperand);
		float c1 = 0;
		if (sign.equals("+")) {
			c1 = a + b;
		} else if (sign.equals("-")) {
			c1 = a - b;
		} else if (sign.equals("*")) {
			c1 = a * b;
		} else if (sign.equals("/")) {
			c1 = a / b;
		}

		c.setOutput("" + c1);
	}
}
