package com.demo.TestingandDebugging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepartmentTest2 {

	@Test
	void test()
	{
		Department department = new Department("ComputerScience",2,"Manudeep","Aavula");
		String nameString = "Manudeep";
		assertEquals(nameString,department.getFirstname());
	}

}
