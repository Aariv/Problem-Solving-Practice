package com.ariv.ds.array.test;

import com.ariv.ds.array.DynamicArray;

public class DynamicArrayTest {

	public static void main(String[] args) {
		DynamicArray<String> dlist = new DynamicArray<String>(5);
		
		dlist.add("H");
		dlist.add("e");
		dlist.add("l");
		dlist.add("l");
		dlist.add("0");
		dlist.addAt(0, "L");
		System.out.println(dlist.size());
		System.out.println(dlist);
		System.out.println(dlist.size());
		
		System.out.println(dlist.isEmpty());
		
		System.out.println(dlist.isFull());
		
		System.out.println(dlist.get(0));
		System.out.println(dlist.get(1));
		System.out.println(dlist.get(2));
		//System.out.println(dlist.get(20)); ArrayIndexOutOfBoundException
		
		dlist.updateAt(4, "HHHH");
		// dlist.updateAt(40, "HHHH"); // ArrayIndexOutOfBoundException
		
		System.out.println(dlist);
		dlist.remove("l");
		System.out.println(dlist);
		dlist.removeAt(3);
		System.out.println(dlist);
	}
}
