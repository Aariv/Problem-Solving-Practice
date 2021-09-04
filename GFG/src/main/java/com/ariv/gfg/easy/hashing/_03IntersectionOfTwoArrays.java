package com.ariv.gfg.easy.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _03IntersectionOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 3, 4, 5, 6, 7 };
		int result = NumberofElementsInIntersection(arr1, arr2);
		System.out.println(result);
	}

	private static int NumberofElementsInIntersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count = 0;
		int i = 0, j = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] > arr2[j])
				j++;
			else if(arr2[j] > arr1[i])
				i++;
			else {
				count++;
				i++;j++;
			}
		}
		return count;
	}

	private static int NumberofElementsInUnion(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i < arr1.length; ++i) {
			map.put(arr1[i], i);
		}
		for(int i =0; i < arr2.length; ++i) {
			map.put(arr2[i], i);
		}
		for(Map.Entry<Integer, Integer> keyValue: map.entrySet()) {
			
		}
		return 0;
	}

	private static int NumberofElementsInIntersectionBF(int[] arr1, int[] arr2) {
//		Set<Integer> data1 = new HashSet<Integer>();
//		for (int ele : arr1) {
//			data1.add(ele);
//		}
//		int count = 0;
//		for (int ele : arr2) {
//			if (!data1.add(ele)) {
//				++count;
//			}
//		}
		int count = 0;
		HashSet<Integer> hs = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
 
        for (int i = 0; i < arr2.length; i++)
            if (hs.contains(arr2[i]))
                count++;
		return count;
	}
}
