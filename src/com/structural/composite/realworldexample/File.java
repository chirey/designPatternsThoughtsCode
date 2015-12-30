package com.structural.composite.realworldexample;

public class File implements FileComponent{

	long size;
	String name;
	
	public File(String n, long s) {
		size = s;
		name = n;
	}
	@Override
	public long getSize() {
		return size;
	}
	
	public void setSize(long size) {
		this.size = size;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public void addComponent(FileComponent fc) throws Exception {
		throw new Exception("You cannot add to a file");
		
	}
	@Override
	public FileComponent getComponent()throws Exception {
		throw new Exception("You cannot get componets of a file");
	}
	

}
