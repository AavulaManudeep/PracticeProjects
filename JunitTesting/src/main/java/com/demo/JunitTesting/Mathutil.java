package com.demo.JunitTesting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

public class Mathutil {
	
	final static Logger log = Logger.getLogger(Mathutil.class);
	
	public int add(int x,int y)
	{
		log.info("It is in the Add Method " + x+y);
		return x+y;
	}
	
	public Iterable<Integer> listing(List<Integer> list)
	{
		log.info("It is in the listing Method " + list);
		list.sort(null);
		return list;
	}

}
