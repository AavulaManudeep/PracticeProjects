package com.demo.JunitTesting;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	logger.info("Main Method Started");
        System.out.println( "Hello World!" );
        Mathutil mathutil = new Mathutil();
        List<Integer> list = new ArrayList<Integer>();
        list.add(40);
        list.add(42);
        list.add(41);
        list.add(43);
        mathutil.add(2, 3);
        System.out.println(mathutil.listing(list));
        logger.info("Main Method Ended");
    }
    
    public int multiplication(int x,int y)
    {
    	
    	return x*y;
    }
}
