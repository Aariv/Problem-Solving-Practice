package com.ariv.epi.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Count pairs with given sum
 * 
 * Given an array of N integers, and an integer K, find the number of pairs of
 * elements in the array whose sum is equal to K.
 *
 */
public class _13Question {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 1};
		
		getPairsCount(arr, arr.length, 6);
		
		getPairsCountHashMap(arr, arr.length, 6);
	}

	private static void getPairsCountHashMap(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for(int i = 0; i < n; ++i) {
			if(map.containsKey(k - arr[i])) {
				count++;
			}
			map.put(arr[i], i);
		}
		System.out.println(count);
	}

	/**
	 * Time Exceeded
	 * @param arr
	 * @param n
	 * @param k
	 */
	private static void getPairsCount(int[] arr, int n, int k) {
		int count = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = i+1; j < n; ++j) {
				if(arr[i] + arr[j] == k) {
					++count;
				}
			} 
		}
		System.out.println(count);
	}
}
