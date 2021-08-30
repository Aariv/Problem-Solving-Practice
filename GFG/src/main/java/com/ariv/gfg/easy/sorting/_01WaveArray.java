package com.ariv.gfg.easy.sorting;

public class _01WaveArray {

	public static void main(String[] args) {
		//int[] arr = { 1, 2, 3, 4, 5 };
		//int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] arr = { 2, 4, 7, 8, 9, 10 };
		convertToWave(arr);
	}

	private static void convertToWave(int[] arr) {
		int n = arr.length;
		if (n % 2 != 0) {
			n = n - 1;
		}
		for (int i = 0; i < n; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

	}
}
