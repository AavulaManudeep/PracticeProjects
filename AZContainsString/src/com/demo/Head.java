/**
 * 
 */
package com.demo;

/**
 * @author manu
 *
 */
public class Head {
	
	private DoubleLinked firstLinked;

	public DoubleLinked getFirstLinked() {
		return firstLinked;
	}

	public void setFirstLinked(DoubleLinked firstLinked) {
		this.firstLinked = firstLinked;
	}

	public Head() {
		super();
	}

	public Head(DoubleLinked firstLinked) {
		super();
		this.firstLinked = firstLinked;
	}

}
