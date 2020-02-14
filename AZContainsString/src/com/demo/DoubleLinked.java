/**
 * 
 */
package com.demo;

/**
 * @author manu
 *
 */
public class DoubleLinked {
	private int value;
	private DoubleLinked prev;
	private DoubleLinked next;
	
	public DoubleLinked(int value) {
		super();
		this.value = value;
		
	}

	public DoubleLinked() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoubleLinked getPrev() {
		return prev;
	}

	public void setPrev(DoubleLinked prev) {
		this.prev = prev;
	}

	public DoubleLinked getNext() {
		return next;
	}

	public void setNext(DoubleLinked next) {
		this.next = next;
	}
	

}
