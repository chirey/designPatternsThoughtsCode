package com.creational.builder;

//Step 3 - Creating a builder class
public class ABuilderClass {
	
	//Step 3a - a variable of the original class which we are trying to build
	private OriginalClass originalObject;
	
	//Step 3b - the default constructor initializes a blank original object
	public ABuilderClass() {
		originalObject = new OriginalClass();
	}
	
	//Step 3.c.i - The new setter methods, returns an object of the builder class and not original class.
	public ABuilderClass setVar1(String var1) {
		//Step 3.c.ii - Reuse the setter of originalClass
		originalObject.setVar1(var1);
		//Step 3.c.iii - Initialize the dependent variables, reuse as much logic as possible from original class
		originalObject.setVar5DependentOnVar1(originalObject.getValueOfV5(var1));
		
		return this;
	}

	//Step 3.c.iv - var2 and var3 are related as per (say) some context so instead of having two setter methods, we combine the setter methods.
	public ABuilderClass setVar2andVar3(String var2, String var3) {
		originalObject.setVar2(var2);
		originalObject.setVar3(var3);
		return this;
	}

	//Step 3.d - intialize the independent variables
	public ABuilderClass setVar4(String var4) {
		originalObject.setVar4(var4);
		return this;
	}

	//Step 4 - create the build method, it is the only method in BuilderClass which returns an OriginalObject
	public OriginalClass build() throws Exception {
		//Step 4a. Check if the object is initialized correctly
		boolean valid = isValid(originalObject);
		if(valid){
			//Step 4.b -returning the original object, which si properly done
			return originalObject;
		} else {
			throw new Exception("OriginalObject could not be properly intialized");
		}
			
		
	}

	private boolean isValid(OriginalClass originalObject2) {
		//For now we do a simple test to check that if originalObject.v1 and orignialObject.var5DependentOnVar1 both should not be null
		boolean inValidCase = originalObject2.getVar1().equals(null) && originalObject2.getVar5DependentOnVar1().equals(null);
		return !inValidCase;
	}

	

}
