package com.ariv.gfg.easy.searching;

public class _01LeftMostRightMostIndex {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int x = 5;
		pair pair = indexes(arr, x);
		System.out.println(pair.first);
		System.out.println(pair.last);
	}

	private static pair indexes(int[] arr, int x) {
		int first = -1, last = -1;
		int n = arr.length;
		for(int i = 0; i < n; ++i) {
			if(arr[i] != x) {
				continue;
			}
			if(first == -1)
				first = i;
			last = i;
		}
		return new pair(first, last);
	}
	
}

class pair {
	long first;
	long last;
	public pair(long first, long last) {
		this.first = first;
		this.last = last;
	}
}
