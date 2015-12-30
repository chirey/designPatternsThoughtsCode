package com.structural.composite.realworldexample;

/**
 * 1. we want to treat individual memebers of a collection and a big collection the same way.
 * 
 * 2. so it means that thier behaviour is the same
 * 
 * 3. hence we need an interface and this is the interface
 * @author moglu
 *
 */
public interface FileComponent {
	public long getSize();
	public FileComponent getComponent() throws Exception;
	public void addComponent(FileComponent fc)throws Exception;
}
