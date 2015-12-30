package com.structural.composite.realworldexample;

public class FileCompositeTest {
	public static void main(String l[]) {
		FileComponent mainDir = new Directory("Main dir");
		
		FileComponent file1 = new File("file1", 10);
		FileComponent file2 = new File("file2", 20);
		FileComponent file3 = new Directory("dir2");
		FileComponent file4 = new File("file4", 40);
		FileComponent file5 = new File("file5", 40);
		
	
		try {
			mainDir.addComponent(file1);
			file3.addComponent(file4);
			mainDir.addComponent(file2);
			mainDir.addComponent(file5);
			
			System.out.println(mainDir.getSize());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
