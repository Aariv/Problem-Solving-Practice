package com.ariv.epi.arrays;

import java.util.Arrays;

import com.ariv.ds.array.DynamicArray;

/**
 * Find the Frequency  
 * 
 * Given a vector of N positive integers and an integer X. 
 * The task is to find the frequency of X in vector.
 *
 */
public class _06Question {

	public static void main(String[] args) {
		DynamicArray<Integer> arr = new DynamicArray<Integer>(Arrays.asList(1, 1, 1, 1, 3));
		int x = 1;
		findFrequency(arr, x);
	}

	private static void findFrequency(DynamicArray<Integer> arr, int x) {
		int frequencyCount = 0;
		for(int i = 0; i < arr.size(); ++i) {
			if(arr.get(i) == x) {
				++frequencyCount;
			}
		}
		System.out.println("Frequency of " + x + " is " + frequencyCount);
	}
	
}
