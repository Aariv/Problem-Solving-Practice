package com.ariv.gfg.easy.hashing;

import java.util.Arrays;

public class _01KeyPair {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		int x = 16;
		boolean result = hasArrayTwoCandidates(arr, x);
		System.out.println(result);
	}

	/**
	 * O(N Log N)
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	private static boolean hasArrayTwoCandidates(int[] arr, int x) {
		Arrays.sort(arr);
		int low = 0, high = arr.length -1;
		
		while(low < high) {
			if(arr[low] + arr[high] == x) {
				return true;
			} else if(arr[low] + arr[high] < x) {
				low++;
			} else {
				high--;
			}
		}
		return false;
	}

	/**
	 * O(N^2)
	 * 
	 * @param arr
	 * @param x
	 * @return
	 */
	private static boolean hasArrayTwoCandidatesBruteForce(int[] arr, int x) {
		for (int i = 0; i < arr.length; ++i) {
			int sum = 0;
			for (int j = i; j < arr.length; ++j) {
				sum += arr[j];
				if (sum == x) {
					return true;
				}
				if (sum > x) {
					break;
				}
			}
		}
		return false;

	}
}
