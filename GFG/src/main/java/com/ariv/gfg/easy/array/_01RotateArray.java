package com.ariv.gfg.easy.array;

import java.util.Arrays;

public class _01RotateArray {

	public static void main(String[] args) {
		// Rotate the array k times

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int d = 2;

		rotateArrayBruteForce(arr, d);
		
		System.out.println(Arrays.toString(arr));
		
		rotateArray(arr, d);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int d) {
		// Incase if d value is more than the size of array elements
		d = d % arr.length;
		reverse(arr, 0, d - 1);
		reverse(arr, d, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	/**
	 * O(d *n)
	 * 
	 * @param arr
	 * @param d
	 */
	private static void rotateArrayBruteForce(int[] arr, int d) {

	}
}
