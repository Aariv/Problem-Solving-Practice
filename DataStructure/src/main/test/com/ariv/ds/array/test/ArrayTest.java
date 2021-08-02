package com.ariv.ds.array.test;

import java.util.Arrays;

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
		
		arr.remove(12);
		
		System.out.println(arr);
		
		arr.removeAt(1);
		
		int[] arr1 = new int[5];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr1.length);
		
		arr1[3] = 0;
		
		System.out.println(arr1.length);
		
	}
}
