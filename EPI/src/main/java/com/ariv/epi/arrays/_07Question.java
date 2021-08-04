package com.ariv.epi.arrays;

import java.util.Arrays;

import com.ariv.ds.array.DynamicArray;

/**
 * 
 * Sort an array of 0s, 1s and 2s
 * 
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in
 * ascending order.
 *
 */
public class _07Question {

	public static void main(String[] args) {
		DynamicArray<Integer> arr = new DynamicArray<Integer>(Arrays.asList(0, 2, 1, 2, 0));

		sort012BF(arr);

		System.out.println(arr);
		
		// using array
		int[] arr1 = new int[] {1, 0, 1, 1, 2, 2, 1};
	}

	private static void sort012BF(DynamicArray<Integer> arr) {
		int zero = 0, one = 0, two = 0;

		for (int i = 0; i < arr.size(); ++i) {
			if (arr.get(i) == 0)
				++zero;
			if (arr.get(i) == 1)
				++one;
			if (arr.get(i) == 2)
				++two;
		}
		int i;
		for (i = 0; i < zero; ++i) {
			arr.updateAt(i, 0);
		}
		for (i = zero; i < (zero + one); ++i) {
			arr.updateAt(i, 1);
		}
		for (i = zero + one; i < (zero + one + two); ++i) {
			arr.updateAt(i, 2);
		}
	}
}
