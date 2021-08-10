package com.ariv.williamfiset.arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {

	private Array<Integer> intArray;

	@Before
	public void setup() {
		intArray = new Array<Integer>(5);
		intArray.add(1);intArray.add(1);intArray.add(2);
		intArray.add(3);intArray.add(5);intArray.add(8);
	}

	@Test
	public void testFunctionalities() {
		assertEquals(6, intArray.size());
		assertFalse(intArray.isEmpty());
		assertEquals(0, intArray.indexOf(1));
		assertEquals("[1,1,2,3,5,8]", intArray.toString());
		int result = (Integer) intArray.removeAt(4);
		assertEquals(5, result);
	}

}
