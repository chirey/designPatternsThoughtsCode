package com.behavioural.interpreter.simplecalc;

public abstract class InterpretorBaseClass {
	ContextClass c = null;

	protected String sign = null;
	protected String leftOperand = null;
	protected String rightOperand = null;

	public abstract void interpret();

	public void setContext(ContextClass c1) {
		c = c1;

	}

	public ContextClass getContext() {
		return c;
	}

	protected String getleft(ContextClass c, String sign) {

		String s = c.getInput();
		s = s.substring(0, s.indexOf(sign));
		return s.trim();

	}

	protected String getright(ContextClass c, String sign) {

		String s = c.getInput();

		return s.substring(s.indexOf(sign) + 1, s.length()).trim();

	}

}
