package com.ariv.epi.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Find duplicates in an array
 * 
 * Given an array a[] of size N which contains elements from 0 to N-1, you need
 * to find all the elements occurring more than once in the given array.
 * 
 */
public class _14Question {

	public static void main(String[] args) {
		//int[] arr = { 0, 3, 1, 2 };
		int[] arr = {13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
		duplicates(arr, arr.length);
	}

	// Bruteforce
	private static void duplicates(int[] arr, int n) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		
		for(int ele: arr) {
			if(!set.add(ele)) {
				set2.add(ele);
			}
		}
		if(set2.isEmpty()) {
			set2.add(-1);
		}
		ArrayList<Integer> result = new ArrayList<Integer>(set2);
		Collections.sort(result);
		System.out.println(result);
	}
}
