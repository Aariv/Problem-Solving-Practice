package com.ariv.gfg.easy.string;

import java.util.Stack;

public class _01ReverseWords {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		System.out.println(str);
		String strResult = reverse(str);
		// much.very.program.this.like.i
		System.out.println(strResult);
	}

	private static String reverseWords(String str) {
		StringBuilder sb = new StringBuilder();

		return sb.toString();
	}

	// Function to reverse a text without reversing the individual words.
	public static String reverse(String s) {
		// `s[low…high]` forms a word
		int low = 0, high = 0;

		// create an empty stack
		Stack<String> stack = new Stack<>();

		// scan the text
		for (int i = 0; i < s.length(); i++) {
			// if `.` is found, we found a word
			if (s.charAt(i) == '.') {
				// push each word into the stack
				stack.push(s.substring(low, high + 1));

				// reset `low` and `high` for the next word
				low = high = i + 1;
			} else {
				high = i;
			}
		}

		// push the last word into the stack
		stack.push(s.substring(low));

		// construct the string by following the LIFO order
		StringBuilder sb = new StringBuilder();
		while (!stack.empty()) {
			sb.append(stack.pop()).append('.');
		}
		sb.deleteCharAt(sb.length() - 1);// remove last space
		return sb.toString();
	}
}
