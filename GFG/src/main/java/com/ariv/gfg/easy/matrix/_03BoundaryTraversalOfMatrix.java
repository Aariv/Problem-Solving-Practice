package com.ariv.gfg.easy.matrix;

public class _03BoundaryTraversalOfMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{10, 20, 30, 40},
				{15, 25, 35, 45},
				{27, 29, 37, 48},
				{32, 33, 39, 50},
		};
		boundaryTraversal(matrix);
	}

	private static void boundaryTraversal(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		for(int i = 0; i < m; ++i) {
			for(int j = 0; j < n; ++j) {
				if(i == 0) {
					System.out.print(matrix[i][j] + " ");
				} else if (i == m - 1) {
					System.out.print(matrix[i][j] + " ");
				} else if(j == 0) {
					System.out.print(matrix[i][j] + " ");
				} else if(j == n-1) {
					System.out.print(matrix[i][j] + " ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
