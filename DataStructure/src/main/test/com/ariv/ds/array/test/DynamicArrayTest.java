package com.ariv.ds.array.test;

import com.ariv.ds.array.DynamicArray;

public class DynamicArrayTest {

	public static void main(String[] args) {
		DynamicArray<String> dlist = new DynamicArray<String>(5);
		
		dlist.add("H");
		dlist.add("e");
		dlist.add("l");
		dlist.add("l");
		dlist.addAt(0, "L");
		
		System.out.println(dlist);
	}
}
