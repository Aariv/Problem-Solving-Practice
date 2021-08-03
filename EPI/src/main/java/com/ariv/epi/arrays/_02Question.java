package com.ariv.epi.arrays;

import java.util.Arrays;

import com.ariv.ds.array.DynamicArray;

/**
 * 
 * Find minimum and maximum element in an array 
 * 
 * Given an array A of size N of integers. 
 * Your task is to find the minimum and maximum elements in the array.
 *
 */
public class _02Question {

	public static void main(String[] args) {
		DynamicArray<Integer> dArray = new DynamicArray<Integer>(Arrays.asList(3, 2, 1, 56, 10000, 167));
		int n = dArray.size();
		getMinMax(dArray, n);
	}

	private static void getMinMax(DynamicArray<Integer> dArray, int n) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for(int i = 0; i < n; ++i) {
			if(dArray.get(i) < min) {
				min = dArray.get(i);
			}
			if(dArray.get(i) > max) {
				max = dArray.get(i);
			}
		}
		System.out.println("Min:" + min);
		System.out.println("Max:" + max);
	}
}
