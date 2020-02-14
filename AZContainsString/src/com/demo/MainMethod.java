/**
 * 
 */
package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author manu
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		
//		String string = "abcdefghijklmnopqsrtuvwxyz";
//		int l=0;
//		for(int i=0;i<string.length();i++)
//		{
//		
//			if(map.get(Character.toString(string.charAt(i))) == null)
//			{
//				map.put(Character.toString(string.charAt(i)), 1);
//				l++;
//			}
//		}
//		if(l==26)
//		{
//			System.out.println("True");
//		}
//		else {
//			System.out.println("false");
//		}
//		System.out.println(map.entrySet());
		
		
//		'
		//StringBuilder lString = new "Manu";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("alkeflkdn");
		StringBuilder stringBuilder1 = new StringBuilder();
		stringBuilder1=stringBuilder;
		String newsString = "Hello";
		newsString=stringBuilder.toString();
		stringBuilder.append("aflknslkf");
		
	
		
		int[] arr = new int[5];
		arr[0]=23;
		arr[1]=24;
		arr[2]=25;
		arr[3]=26;
		
		Tail tail = new Tail();
		
		DoubleLinked linkedlist= new DoubleLinked();
		
		Head head = new Head(linkedlist);
		
		DoubleLinked currentnode= new DoubleLinked();
		
		DoubleLinked previous = new DoubleLinked();
		
		currentnode=linkedlist;
		
		//previous.setPrev(currentnode);
		previous.setPrev(null);
		for(Integer integer : arr)
		{
			currentnode.setValue(integer);
			currentnode.setNext(new DoubleLinked());
			if(previous.getPrev()==null)
				currentnode.setPrev(null);
			else {
				System.out.println(previous.getPrev());
				currentnode.setPrev(previous.getPrev());
			}
			previous.setPrev(currentnode);
			currentnode=currentnode.getNext();
			currentnode.setPrev(previous.getPrev());
		}
		tail.setLastLinked(currentnode);
		currentnode=head.getFirstLinked();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(currentnode.getValue());
			currentnode=currentnode.getNext();
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		currentnode= tail.getLastLinked();
		
		//System.out.println(currentnode.getPrev().getPrev().getValue());
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(currentnode.getValue());
		 * currentnode=currentnode.getPrev(); }
		 */
		 for(int i=0;i<=arr.length;i++) {
			System.out.println(currentnode.getValue());
		  currentnode=currentnode.getPrev(); }
	}
	
	
}
