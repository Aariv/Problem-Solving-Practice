package com.ariv.ds.array.test;

import com.ariv.ds.array.Array;

public class ArrayTest {

	public static void main(String[] args) {
		Array<Integer> arr = new Array<Integer>(5);
		arr.add(12);
		arr.add(5);
		arr.add(10);
		arr.add(25);
		arr.add(34);
		// arr.add(34); ArrayIndexBoundException since only 5 elements can be stored. 
		System.out.println(arr);
		System.out.println(arr.size());
		// System.out.println(arr.get(5)); // ArrayIndexOutOfBound
		System.out.println(arr.get(4));
	}
}
