package com.structural.flyweight.old;

import java.util.HashMap;

public class FlyWtFactory {

	static FlyWtFactory fac = null;
	HashMap flyWtMap;

	private FlyWtFactory() {
		flyWtMap = new HashMap();
	}

	public static FlyWtFactory getInstance() {
		
		if(fac == null){
			System.out.println("Fac is null .. intializing");
			fac = new FlyWtFactory();
		}else {
			System.out.println("Fac initializing returning singleton");
		}
		
		return fac;

	}
	
	public AllData getFlyData(String e1, String e2){
		
		AllData ad = null;
		FlyWtData fd = (FlyWtData) flyWtMap.get(getKey(e1, e2));
		
		if(fd == null){
			
			//Create new flyWeight
			fd = new FlyWtData(e1, e2);
			//Put this for retrieval
			flyWtMap.put(getKey(e1, e2), fd);
		}else {
			System.out.println("Returning from map");
		}
		ad = new AllData(e1 + "1", e2 + "2" , fd);
		System.out.println("object address ad = " + ad);
		System.out.println("object address fd = " + fd);
		
		return ad;
	}

	private Object getKey(String e1, String e2) {
		return e1 + e2;
	}

}
