package com.ariv.gfg.easy.searching;

public class _02BitonicPoint {

	public static void main(String[] args) {
		int[] arr = {-3, -2, 4, 6, 10, 8, 7, 1};
		int result = findMaximum(arr);
		System.out.println(result);
	}

	private static int findMaximum(int[] arr) {
		int n = arr.length;

		int left = 1;
		int right = n - 2;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid - 1] < arr[mid + 1] && arr[mid] > arr[mid + 1]) {
				return arr[mid];
			}

			// 
			if(arr[mid] < arr[mid+1]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
