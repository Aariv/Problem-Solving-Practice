package com.ariv.gfg.easy.matrix;

public class _02SearchInSorted2DNot2DMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50},
		};
		int x = 29;
		boolean result = search(matrix, x);
		System.out.println(result);
	}

	private static boolean search(int[][] matrix, int x) {
		return false;
	}

	private static boolean searchBruteForce(int[][] matrix, int x) {
		int m = matrix.length;
		int n = matrix[0].length;
		for(int i = 0; i < m; ++i) {
			for(int j = 0; j < n; ++j) {
				if(matrix[i][j] == x) {
					System.out.println("Matrix is (" + i + ", " + j + ")");
					return true;
				}
			}
		}
		return false;
	}
}
