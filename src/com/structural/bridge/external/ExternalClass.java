package com.structural.bridge.external;

import com.structural.bridge.pattern.A3LogicConcreteClass;
import com.structural.bridge.pattern.ALogicInterface;
import com.structural.bridge.pattern.B1LogicConcreteClass;
import com.structural.bridge.pattern.BLogicInterface;
import com.structural.bridge.pattern.ModelASubClass;
import com.structural.bridge.pattern.ModelOrAbstractionOrBaseClass;

public class ExternalClass {

	public static void main(String args[]) {

		// Step 7 - obtain the right model and right concrete logic interface
		ModelOrAbstractionOrBaseClass model = new ModelASubClass();
		ALogicInterface aLogic = new A3LogicConcreteClass();

		// Step 7.b Initialize the model class with the right logic class.
		model.setaLogicInteface(aLogic);

		// Step 7.c more than one interface so initialize those too.
		BLogicInterface bLogic = new B1LogicConcreteClass();
		model.setbLogicInteface(bLogic);

		// Step 7.d. Finally, use the model class.
		// We have not use any arguments to keep it simple and domain agnostic.
		model.a1ModelMethod(null);
		model.a2ModelMethod(null);
		model.b1ModelMethod(null);

	}

}
