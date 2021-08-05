package com.ariv.epi.arrays;

import java.util.Arrays;

/**
 * Missing number in array
 * 
 * Given an array of size N-1 such that it only contains distinct integers in
 * the range of 1 to N. Find the missing element.
 *
 */
public class _12Question {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		
		missingNumber(arr, arr.length);
	}

	private static void missingNumber(int[] arr, int n) {
		//int sum = Arrays.stream(arr).sum();
		int sum = 0;
		for(int i = 0; i < n; ++i) {
			sum += arr[i];
		}
		// the actual size is `n+1` since a number is missing from the array
		int m = n+1;
		// get a sum of integers between 1 and `n+1`
		int sumtotal = m * (m + 1) / 2;
		// the missing number is the difference between the expected sum
        // and the actual sum
		System.out.println(sumtotal - sum);
	}
}
