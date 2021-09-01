package com.ariv.gfg.easy.string;

public class _02LongestCommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "geeksforgeeks", "geeks", "geek", "geezers" };
		String result = longestCommonPrefix(arr);
		System.out.println(result);
	}

	private static String longestCommonPrefix(String[] arr) {
		String prefix = arr[0];
		for(int i = 1; i < arr.length; ++i) {
			prefix = findLCP(prefix, arr[i]);
		}
		return prefix;
	}

	private static String findLCP(String prefix, String string) {
		StringBuilder sb = new StringBuilder();
		int n1 = prefix.length();
		int n2 = string.length();
		for(int i = 0, j = 0; i < n1 && j < n2; i++, j++) {
			if(prefix.charAt(i) != string.charAt(j)) {
				break;
			}
			sb.append(prefix.charAt(i));
		}
		return sb.toString();
	}
}
