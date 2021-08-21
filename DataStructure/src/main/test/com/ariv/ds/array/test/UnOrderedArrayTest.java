package com.ariv.ds.array.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.array.UnOrderedArray;

public class UnOrderedArrayTest {

	@Test
	public void testAdd() {
		UnOrderedArray<Integer> intArray = new UnOrderedArray<Integer>();
		intArray.add(23);
		assertEquals(1, intArray.size());
		intArray.add(2);
		intArray.add(25);
		intArray.add(26);
		assertEquals(4, intArray.size());
		intArray.add(27);
		assertEquals(5, intArray.size());
	}
}
