package com.ariv.williamfiset.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		Array<Integer> intArray = new Array<Integer>(5);
		
		intArray.add(1);
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intArray.add(5);
		intArray.add(8);
		
		System.out.println(intArray.isEmpty()); // false
		System.out.println(intArray.size()); // 6
		intArray.add(13);
		intArray.add(21);
		intArray.add(34);
		intArray.add(55);
		intArray.add(89);
		System.out.println(intArray.size()); // 11
		intArray.removeAt(4);
		System.out.println(intArray.size()); // 10
		System.out.println(intArray.contains(8)); // true
		System.out.println(intArray.indexOf(1)); // 0
		
		for(Integer value: intArray) {
			System.out.println(value);
		}
		
		System.out.println(intArray); // [1,1,2,3,8,13,21,34,55,89]
	}
}
