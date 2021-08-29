package com.ariv.gfg.easy.array;

import java.util.HashMap;
import java.util.Map;

public class _02MajorityElement {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 3, 2, 3, 1, 1, 1};
		
		int result = findMajority(arr1);
		System.out.println(result);
	}

	/**
	 * O(N), O(N)
	 * @param arr1
	 */
	private static int findMajority(int[] arr1) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int ele: arr1) {
			map.put(ele, map.getOrDefault(ele, 0) + 1);
		}
		int times = arr1.length / 2;
		for(int ele: map.keySet()) {
			if(map.get(ele) > times) {
				return ele;
			}
		}
		return -1;
	}

	private static int findMajorityBruteForce(int[] arr1) {
		int n = arr1.length;
		int times = n / 2;
		int maxCount = 0;
		int index = 0;
		for(int i = 0; i < n; ++i) {
			int count = 0;
			for(int j = 0; j < n; ++j) {
				if(arr1[i] == arr1[j]) {
					count++;
				}
			}
			if(count > maxCount) {
				maxCount = count;
				index = i;
			}
		}
		if(maxCount > times) {
			return arr1[index];
		}
		return -1;
	}
}
