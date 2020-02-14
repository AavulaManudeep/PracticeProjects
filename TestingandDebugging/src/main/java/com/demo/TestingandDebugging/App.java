package com.demo.TestingandDebugging;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Department department = new Department("Computer Science",1,"Manudeep","Aavula");
        System.out.println(department.getId());
        
    }
}
