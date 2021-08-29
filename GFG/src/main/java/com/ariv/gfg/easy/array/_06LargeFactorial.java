package com.ariv.gfg.easy.array;

import java.util.Arrays;

public class _06LargeFactorial {

	public static void main(String[] args) {
		//int[] arr = { 0, 1, 2, 3, 4 };
		int[] arr = { 5, 6, 3 };
		long[] result = factorial(arr);
		System.out.println(Arrays.toString(result));
	}

	private static long[] factorial(int[] arr) {
		return null;
	}

	private static long[] factorialBruteForce(int[] arr) {
		int n = arr.length;
		long[] result = new long[n];
		for (int i = 0; i < n; ++i) {
			if (arr[i] == 0 || arr[i] == 1) {
				result[i] = 1;
			} else {
				result[i] = fact(arr[i]);
			}
		}
		return result;
	}

	private static int fact(int factorial) {
		int product = 1;
		for (int i = 1; i <= factorial; ++i) {
			product *= i;
		}
		return product;
	}
}
