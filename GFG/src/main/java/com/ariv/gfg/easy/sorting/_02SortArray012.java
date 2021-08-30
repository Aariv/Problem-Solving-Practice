package com.ariv.gfg.easy.sorting;

import java.util.Arrays;

public class _02SortArray012 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 2, 1, 1 };
		System.out.println(Arrays.toString(arr));
		sort123(arr);
		// #1 Counting sort with multiple traversal.
		// #2 Dutch National Flag Problem
		System.out.println(Arrays.toString(arr));
	}

	private static void sort123(int[] arr) {
		int start = 0, mid = 0, pivot = 1, end = arr.length -1;
		
		while(mid <= end) {
			if(arr[mid] < pivot) {
				swap(arr, start, mid);
				++start;
				++mid;
			} else if(arr[mid] > pivot) {
				swap(arr, mid, end);
				--end;
			} else {
				++mid;
			}
		}
	}

	private static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
}
