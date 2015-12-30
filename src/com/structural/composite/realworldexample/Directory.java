package com.structural.composite.realworldexample;

import java.util.ArrayList;

public class Directory extends File implements FileComponent {

	public Directory(String n) {
		super(n, 1);
	}

	/**
	 * 2 it can contain a collection of fileCOmponent
	 * 
	 * so we need a data strcuture to hold this
	 */

	ArrayList files = new ArrayList();

	/**
	 * 3. We need extra functions to add and delete from the collection
	 * 
	 * for now we just write add fucntion
	 */

	public void addComponent(FileComponent d) {
		files.add(d);
	}

	/**
	 * 4 our Directory implements fileComponent so we have to write the impl
	 */
	@Override
	public long getSize() {
		
		long dirSize = 0;
		FileComponent fc = null;
		for (Object object : files) {
			fc = (FileComponent) object;
			dirSize += fc.getSize();
		}
		return dirSize;
	}
}
