package com.demo.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MathutilTest {

	@Test
	void test() {
		Mathutil mathutil = new Mathutil();
		int expected = 4;
		int actual=mathutil.add(1, 3);
		List<Integer> list = Arrays.asList(42,43,41,40);
		List<Integer> exp =  Arrays.asList(40,41,42,43);
		assertEquals(expected, actual);
		assertIterableEquals(exp, mathutil.listing(list));
		
		
	}

}
