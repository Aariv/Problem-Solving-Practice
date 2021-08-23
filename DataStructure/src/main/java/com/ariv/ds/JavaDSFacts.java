package com.ariv.ds;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class JavaDSFacts {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		// private static final int DEFAULT_CAPACITY = 10;
		
		Set<Integer> set = new HashSet<Integer>();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
		// static final float DEFAULT_LOAD_FACTOR = 0.75f;
		
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		// elements = new Object[16];
		Queue<Integer> pQueue = new PriorityQueue<Integer>();
		// private static final int DEFAULT_INITIAL_CAPACITY = 11;
	}
}
