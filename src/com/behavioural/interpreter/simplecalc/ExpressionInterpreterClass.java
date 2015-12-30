/**
 * 
 */
package com.behavioural.interpreter.simplecalc;

/**
 * @author Mainak
 * 
 * Note that this ExpressionInterpreter class is very fragile because it does not cater for even simple edge cases. That is it will not work if we give it bad input say "2 2" or use other arithmetic operator etc. It is intentionally kept so to reduce the amount of code required to be done, so that there is a clear disctinction between the pattern and the code to create an actual working function that will work like a calculator.  
 */
public class ExpressionInterpreterClass extends InterpretorBaseClass {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.behavioural.interpreter.calc4.Interpretor#interpret()
	 */
	@Override
	public void interpret() {
		
		//Step 5.a	The ExpressionInterpreterClass obtains the expression to be reduced from the Context. 
		String input = c.getInput();
		
		// is it complex or simple
		//Step 5.b	Finds out if the expression is complex or terminal
		boolean complex = isComplex(input);
		
		
		if (complex) {
			
			//Step: 6a Reduction of the expression into smaller items.
				//In this case we find the FIRST arithmetic sign and split the expression
				//Note in other words we are ignoring operator precedence here.
				//If we were to check for operator precedence then we would choose to split where we find the most precendent operator.
			sign = findOperator(c.getInput());
			leftOperand = getleft(c, sign);
			rightOperand = getright(c, sign);
			
			//Step 6.b - Use recursion to solve the rest of the expression.
			ExpressionInterpreterClass e = new ExpressionInterpreterClass();
			ContextClass c1 = new ContextClass();
			c1.setInput(rightOperand);
			e.setContext(c1);
			e.interpret();

			//Step 6.c - Join the results
			leftOperand = leftOperand + sign + c1.getOutput();

		} else {
			leftOperand = c.getInput();
		}
		
		//Step 7 - 7.	If not complex, then evaluate using one of the terminal expressions interpreter.
		TerminalInterpreterClass t = new TerminalInterpreterClass(findOperator(leftOperand));
		c.setInput(leftOperand);
		t.setContext(c);
		t.interpret();
		c.setOutput(t.getContext().getOutput());
	}
	/**
	 * @param leftOperand
	 * @return
	 */

	public String findOperator(String leftOperand) {
		int len = leftOperand.length();
		Operators ops = new Operators();

		for (int i = 0; i < len; i++) {
			if (ops.contains("" + leftOperand.charAt(i)))
				return "" + leftOperand.charAt(i);
		}
		return null;
	}

	/**
	 * @param input
	 * @return
	 */
	private boolean isComplex(String input) {
		int len = input.length();
		int operatorCount = 0;
		for (int i = 0; i < len; i++) {
			char c = input.charAt(i);
			if (c == '+' || c == '-') {
				operatorCount++;
			}
		}

		if (operatorCount > 1)
			return true;
		else
			return false;
	}

}
