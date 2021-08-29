package com.ariv.gfg.easy.array;

import java.util.ArrayList;
import java.util.Arrays;

public class _03PlusOne {

	public static void main(String[] args) {
//		System.out.println(Math.pow(10, 5));
//		System.out.println(Integer.MAX_VALUE);
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(9, 9));
		System.out.println(arr);
		plusOne(arr);
		System.out.println(arr);
	}

	private static ArrayList<Integer> plusOne(ArrayList<Integer> arr) {
		int N = arr.size();
		int carry = process(arr, N-1);
		for(int i = N-2; i >= 0; i--) {
			if(carry == 1) {
				carry = process(arr, i);
			}
		}
		if(carry == 1) {
			arr.add(0, 1);
		}
		return arr;
	}

	private static int process(ArrayList<Integer> arr, int pos) {
		int last = arr.get(pos) + 1;
		int carry = last / 10;
		int remainder = last % 10;
		arr.set(pos, remainder);
		return carry;
	}
}
