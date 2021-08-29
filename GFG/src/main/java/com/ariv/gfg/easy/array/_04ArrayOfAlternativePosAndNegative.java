package com.ariv.gfg.easy.array;

import java.util.Arrays;

public class _04ArrayOfAlternativePosAndNegative {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, -4, -1, 4 };
		System.out.println(Arrays.toString(arr));
		rearrange(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void rearrange(int[] arr) {
		int neg = 0, pos = 0;

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < 0) {
				neg++;
			} else {
				pos++;
			}
		}
		int[] arr2 = new int[neg];
		int[] arr3 = new int[pos];
		int k = 0, l = 0;
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] < 0) {
				arr2[k++] = arr[i];
			} else {
				arr3[l++] = arr[i];
			}
		}
		merge(arr, arr2, arr3);
	}

	private static void merge(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0;
		int j = 0;
		int k = 0;
		int d = 0;
		while (i < arr2.length && j < arr3.length) {
			if(d % 2 == 0) {
				// pos
				arr1[k++] = arr3[j++];
			} else {
				
				// neg
				arr1[k++] = arr2[i++];
			}
			d++;
		}
		
		while(i < arr2.length) {
			arr1[k++] = arr2[i++];
		}
		
		while(j < arr3.length) {
			arr1[k++] = arr3[j++];
		}
	}
}
