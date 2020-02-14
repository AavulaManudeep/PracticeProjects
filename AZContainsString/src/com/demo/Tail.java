/**
 * 
 */
package com.demo;

/**
 * @author manu
 *
 */
public class Tail {
	
	private DoubleLinked lastLinked;

	public Tail(DoubleLinked lastLinked) {
		super();
		this.lastLinked = lastLinked;
	}

	public DoubleLinked getLastLinked() {
		return lastLinked;
	}

	public void setLastLinked(DoubleLinked lastLinked) {
		this.lastLinked = lastLinked;
	}

	public Tail() {
		super();
	}

	


}
