package com.demo.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainMethodTest {

	@Test
	void testMain() {
		Student student = new Student("manu",23,"computerscience","manu@gmail");
		Student student2 = new Student("manu",23,"computerscience","manu@gmail");
		Student student3 = new Student("Gavi",13,"computerscience","manu@gmail");
		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student2);
		students.add(student3);
		Collections.sort(students, Student.namecomparator);
		assertEquals(student.getEmailid(), student2.getEmailid());
	}

}
