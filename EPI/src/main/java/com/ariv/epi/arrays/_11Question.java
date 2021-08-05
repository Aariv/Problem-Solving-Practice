package com.ariv.epi.arrays;

import java.util.Arrays;

/**
 * Cyclically rotate an array by one
 * 
 * Given an array, rotate the array by one position in clock-wise direction.
 *
 */
public class _11Question {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		rotate(arr, arr.length);
		
		// 5 1 2 3 4
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr, int n) {
		int temp = arr[n-1];
		for(int i = n-1; i > 0; --i) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
	}
}
