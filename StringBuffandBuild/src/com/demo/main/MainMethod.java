/**
 * 
 */
package com.demo.main;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.apache.log4j.Logger;

/**
 * @author manu
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Manudeep");
		System.out.println(stringBuffer.length());
		stringBuffer.reverse();
		System.out.println(stringBuffer.toString());
		System.out.println(stringBuffer.capacity());
		
		StringBuilder stringBuilder = new StringBuilder();
		//stringBuilder.append("SaiTeja");
		
		Optional<StringBuffer> optional=Optional.of(stringBuffer);
		optional.ifPresent(y->System.out.println(y));
		
		String name = new String();
		name = name.concat("wahgor");
		System.out.println(name.substring(3));
		System.out.println(name.indexOf('a'));
		java.util.List<String> list = Stream.of(name).filter(l->l.contains("a")).map(n-> n).collect(Collectors.toList());
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(12);
		list2.add(19);
		list2.add(1);
		list2.add(14);
		list2.add(1);
		list2.add(12);
		list2.add(1);
		int integers = list2.stream().mapToInt(l2->l2*1).distinct().sum();
		//Collections.sort(integers);
		System.out.println(integers);
		Student student = new Student("manu",23,"computerscience","manu@gmail");
		Student student2 = new Student("manu",23,"computerscience","manu@gmail");
		Student student3 = new Student("Gavi",13,"computerscience","manu@gmail");
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student2);
		students.add(student3);
		System.out.println(student.equals(student2));
		Collections.sort(students, Student.namecomparator);
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(9);
		stack.push(90);
		stack.push(91);
		stack.push(92);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		
		System.out.println(students);
		
		String s = "welCOMetojava";
		
		
		String[] testStrings = new String[10];
		
		testStrings[0]="manu";
		
		 List<String> stringarray = new ArrayList<String>();
	        for(int i=0;i<=s.length()-3;i++)
	        {
	        	stringarray.add(s.substring(i, i+3));
	        }
	       Collections.sort(stringarray);
	       
	      System.out.println(stringarray);
	      
	      System.out.println(stringarray.get(10));
	      
	     // stringcomp("aaaabbbccd","aabbccd");
	     
	      String aString = "aaabccd";
	      char[] caraCharacters = aString.toCharArray();
	      System.out.println(caraCharacters[0]);
	      //Set<Character> set = new HashSet<Character>();
	      Stream.of(caraCharacters).forEach(sa -> System.out.println(sa));
	    
	      //Collections.addAll(set, );
	      Set<Student> students2 = new HashSet<Student>();
	      students2.add(new Student("manu",23,"computerscience","manu@gmail"));
	      students2.add(new Student("manu",23,"computerscience","manu@gmail"));
	      Student student4 = new Student("manu",2,"computerscience","manu@gmail");
	      Student  student5 = student4;
	      students2.add(student4);
	      students2.add(student5);
	      System.out.println(students2);
	      Twitter twitter = new Twitter();
	      twitter.postTweet(1, 5);
	      twitter.postTweet(1, 6);
	      System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	      System.out.println(twitter.getNewsFeed(1));
	      twitter.postTweet(2, 7);
	      twitter.postTweet(2, 8);
	      twitter.follow(1, 2);
	      twitter.postTweet(2, 9);
	      System.out.println(twitter.getNewsFeed(1));
	      twitter.unfollow(1, 2);
	      twitter.unfollow(1, 2);
	      twitter.follow(1, 2);
	      twitter.postTweet(3, 71);
	      twitter.postTweet(3, 81);
	      twitter.follow(1, 3);
	      System.out.println(twitter.getNewsFeed(1));
	      
	     
	}
	
//	public static boolean stringcomp(String A,String B)
//	{
//		
//		B.toCharArray();
//		Set<Character> carSet = new HashSet<Character>();
//		Collections.addAll(carSet, A.toCharArray());
//		
//		return false;
//	}

}
