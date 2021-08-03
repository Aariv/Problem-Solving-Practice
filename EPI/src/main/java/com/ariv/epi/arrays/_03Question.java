package com.ariv.epi.arrays;

/**
 * 
 * Reverse a String 
 * 
 * You are given a string s. You need to reverse the string.
 *
 */
public class _03Question {

	public static void main(String[] args) {
		String str = "Geeks";
		
		reverseWord(str);
	}

	private static void reverseWord(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			sb.insert(0, ch);
		}
		System.out.println(sb.toString());
	}
}
