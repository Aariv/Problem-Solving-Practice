package com.ariv.gfg.easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _03ChocolateDistributionProblem {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
		
		int m = 3;
		
		findMinDiff(arr, m);
	}

	private static long findMinDiff(int[] arr, int m) {
		int n = arr.length;
		if(n == 0 || m == 0)
			return 0;
		if(n < m) 
			return -1;
		// Sort the array
		Arrays.sort(arr);
		
		int minDiff = Integer.MAX_VALUE;
		
		for(int i = 0; i + m - 1 < n; ++i) {
			int diff = arr[i+m-1] - arr[i];
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
	
	private static long findMinDiff(ArrayList<Long> arr, int n, int m) {
		if(n == 0 || m == 0)
			return 0;
		if(n < m) 
			return -1;
		// Sort the array
		Collections.sort(arr);
		
		long minDiff = Long.MAX_VALUE;
		
		for(int i = 0; i + m - 1 < n; ++i) {
			long diff = arr.get(i+m-1) - arr.get(i);
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
}
