package com.ariv.gfg.easy.math;

public class _01MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7 };

		int diff = findMissingNumber(arr);

		System.out.println("Missing number is: " + diff); // 6

		int[] arr2 = { 1, 2, 3 };

		diff = findMissingNumber(arr2);

		System.out.println("Missing number is: " + diff); // 4

		int[] arr3 = { 1, 3 };

		diff = findMissingNumber(arr3); // 2
		
		int[] arr4 = { 2, 3 };

		diff = findMissingNumber(arr4); // 1

		System.out.println("Missing number is: " + diff); // 0
	}

	private static int findMissingNumber(int[] arr) {
		int N = arr.length + 1; // Added +1 as we have to find the missing number that should be included

		int sum = 0;
		for (int i = 0; i < N - 1; ++i) {
			sum += arr[i];
		}

		int nSeq = (N * (N + 1)) / 2;

		int diff = nSeq - sum;

		return diff;
	}
}
