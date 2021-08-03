package com.ariv.epi.arrays;

import java.util.Arrays;
import java.util.Comparator;

import com.ariv.ds.array.DynamicArray;

/**
 * Kth smallest element
 * 
 * Given an array arr[] and a number K where K is smaller than size of array,
 * the task is to find the Kth smallest element in the given array. It is given
 * that all array elements are distinct.
 *
 */
public class _05Question {

	public static void main(String[] args) {

		DynamicArray<Integer> arr = new DynamicArray<Integer>(Arrays.asList(10, 3, 6, 9, 2, 4, 15, 23));
		int k = 5;
		// Bruteforce
		
		// 10, 3, 6, 9, 2, 4, 15, 23
		// 2, 3, 4, 6, 9, 10, 15, 23
		kthSmallestBruteForce(arr, k);
		// Min-Heap

		// Max-Heap

	}

	private static void kthSmallestBruteForce(DynamicArray<Integer> arr, int k) {
		sort(arr);
		System.out.println(arr);
		//int index = arr.size() - 1 - k;
		System.out.println(k + "'th smallest element is:" +arr.get(k-1));
	}

	private static void sort(DynamicArray<Integer> arr) {
		for (int i = 1; i < arr.size(); ++i) {
			int key = arr.get(i);
			int j = i - 1;

			/*
			 * Move elements of arr[0..i-1], that are greater than key, to one position
			 * ahead of their current position
			 */
			while (j >= 0 && arr.get(j) > key) {
				arr.updateAt(j + 1, arr.get(j));
				j = j - 1;
			}
			arr.updateAt(j + 1, key);
		}
	}

}
