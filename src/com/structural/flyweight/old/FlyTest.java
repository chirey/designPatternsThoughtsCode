package com.structural.flyweight.old;

import java.util.Scanner;

public class FlyTest {

	public static void main(String args[]) {
		FlyWtFactory fac = FlyWtFactory.getInstance();

		Scanner in = new Scanner(System.in);

		String a1, a2 = null;
		
		AllData ad = null;
		
		while (true) {
			System.out.println("Please enter name (Press Enter)");
			a1 = in.nextLine();
			System.out.println("Please enter title (Press Enter)");
			a2 = in.nextLine();
			System.out.println("The inputs are " + a1 + " " + a2 + "\n");
			
			ad = fac.getFlyData(a1, a2);
			
		}

	}

}
