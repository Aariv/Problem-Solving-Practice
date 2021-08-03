package com.ariv.epi.arrays;

import com.ariv.ds.array.Array;

/**
 * 
 * Check if a key is present in every segment of size k in an array
 *
 * Question: 
 * 
 * Given an array arr[] and size of array is n and one another key x, 
 * and give you a segment size k. 
 * 
 * The task is to find that the key x present in every segment of size k in arr[].
 */
public class _01Question {

	public static void main(String[] args) {
		
		// CASE:01
		Array<Integer> inputArray01 = new Array<Integer>(12);
		inputArray01.add(3);inputArray01.add(5);inputArray01.add(2); // 3 is available 
		inputArray01.add(4);inputArray01.add(9);inputArray01.add(3); // 3 is available 
		inputArray01.add(1);inputArray01.add(7);inputArray01.add(3); // 3 is available 
		inputArray01.add(11);inputArray01.add(12);inputArray01.add(3); // 3 is available

		// CASE:02, X= 23, K = 5
		Array<Integer> inputArray02 = new Array<Integer>(13);
		inputArray02.add(21);inputArray02.add(23);inputArray02.add(56); // 23 is available 
		inputArray02.add(65);inputArray02.add(34);
		
		inputArray02.add(54);inputArray02.add(76);inputArray02.add(32); // 23 is available 
		inputArray02.add(23);inputArray02.add(45);
		
		inputArray02.add(21);inputArray02.add(23);inputArray02.add(25);
		
		
		// So output is Yes
		int x = 23, k = 5;
		
		boolean result = findXinKWindow(inputArray02, x, k);
		if(result)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean findXinKWindow(Array<Integer> inputArray, int x, int k) {
		
		int N = inputArray.size();
		int i;
		// Iterate from 0 -> N-1		
		for(i = 0; i < N; i = i+k) {
			// Iterate from 0 -> k -1
			for(int j = 0; j < k; ++j) {
				if(i + j < N && inputArray.get(i + j) == x) {
					break;
				}
				
				if(j == k)
					return false;
				
				if(i + j >= N)
					return false;
			}
		}
		if(i >= N) {
			return true;
		}
		return false;
	}
}
