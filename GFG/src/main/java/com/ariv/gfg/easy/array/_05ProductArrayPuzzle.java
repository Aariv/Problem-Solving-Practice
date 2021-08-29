package com.ariv.gfg.easy.array;

import java.util.Arrays;

public class _05ProductArrayPuzzle {

	public static void main(String[] args) {
		int[] arr = { 10, 3, 5, 6, 2 };
		System.out.println(Arrays.toString(arr));
		long[] result = productExceptSelf(arr);
		System.out.println(Arrays.toString(result));
	}

	/**
	 * O(N * N)
	 * 
	 * @param arr
	 * @return
	 */
	private static long[] productExceptSelfBruteForce(int[] arr) {
		int n = arr.length;
		long[] result = new long[n];
		for (int i = 0; i < n; ++i) {
			int product = 1;
			for (int j = 0; j < n; ++j) {
				if (i == j)
					continue;
				product *= arr[j];
			}
			result[i] = product;
		}
		return result;
	}

	private static long[] productExceptSelf(int[] arr) {
		int n = arr.length;
		long[] result = new long[n];
		int i, temp = 1;
		for (i = 0; i < n; ++i) {
			result[i] = 1;
		}
		for (i = 0; i < n; ++i) {
			result[i] = temp;
			temp *= arr[i];
		}

		temp = 1;

		for (i = n - 1; i >= 0; i--) {
			result[i] *= temp;
			temp *= arr[i];
		}
		return result;
	}
}
