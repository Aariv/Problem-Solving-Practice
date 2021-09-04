package com.ariv.gfg.easy.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class _02TopKFrequentElement {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 4, 3, 3, 3 };
		int k = 2;
		topK(arr, k);
	}

	private static int[] topK(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; ++i) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if(o1.getValue() == o2.getValue()) {
					return o2.getKey() - o1.getKey();
				}
				return o2.getValue() - o1.getValue();
			}

		});
		int[] result = new int[k];
		for(int i = 0; i < k; ++i) {
			result[i] = list.get(i).getKey();
		}
		return result;
	}
	
	private static void topKUsingPQ(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; ++i) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> queue = 
				new PriorityQueue<Map.Entry<Integer,Integer>>(
						(a, b) -> a.getValue().equals(b.getValue())
						? Integer.compare(b.getKey(), a.getKey())
					    : Integer.compare(b.getValue(), a.getValue()));
		
		for (Entry<Integer, Integer> entrySet : map.entrySet()) {
			queue.offer(entrySet);
		}
		
		for(int i = 0; i < k; ++i) {
			System.out.println(queue.poll().getKey());
		}
	}
}
