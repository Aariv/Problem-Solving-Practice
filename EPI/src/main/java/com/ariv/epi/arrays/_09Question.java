package com.ariv.epi.arrays;

import java.util.Arrays;

/**
 * Move all negative elements to end
 *
 * Given an unsorted array having both negative and positive integers. 
 * The task is place all negative element at the end of array without changing the order
 * of positive element and negative element.
 * 
 */
public class _09Question {

	public static void main(String[] args) {
		int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };

		// out
		// 1, 3, 2, 11, 6, -1, -7, -5
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		
		segregateElements(arr, n);
		
		System.out.println(Arrays.toString(arr));
	}

	// If the output is order important then we can use Aux array
	private static void segregateElements(int[] arr, int n) {
		int j = 0;
		int[] temp = new int[n];
		// Update positive values first
		for (int i = 0; i < n; ++i) {
			if (arr[i] >= 0) {
				temp[j++] = arr[i];
			}
		}

		// Update negative values
		for (int i = 0; i < n; ++i) {
			if (arr[i] < 0) {
				temp[j++] = arr[i];
			}
		}
		
		// copy back to original array
		for(int i = 0; i < n; ++i) {
			arr[i] = temp[i];
		}
	}
}
