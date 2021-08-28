package com.ariv.gfg.easy.math;

public class _02MinimumStepsProductToOne {

	public static void main(String[] args) {
		int[] arr1 = {0, -2, -1, -3, 4};
		//int[] arr1 = {-2, 4, 0};
		int n = arr1.length;
		int result = makeProductOne(arr1, n);
		System.out.println("The number of steps: " + result);
	}

	private static int makeProductOne(int[] arr1, int n) {
		int positive = 0, negative = 0, zero = 0;

		int step = 0;

		for (int i = 0; i < n; ++i) {
			if (arr1[i] == 0)
				zero++;

			else if (arr1[i] < 0) {
				negative++;

				step = step + (-1 - arr1[i]);
			} else {
				positive++;
				step = step + (arr1[i] - 1);
			}
		}
		
		if(negative % 2 == 0) {
			step = step + zero;
		} else {
			if(zero > 0) {
				step = step + zero;
			} else {
				step = step + 2;
			}
		}
		
		return step;
	}
}
