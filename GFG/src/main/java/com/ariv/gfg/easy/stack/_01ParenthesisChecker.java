package com.ariv.gfg.easy.stack;

import java.util.Stack;

public class _01ParenthesisChecker {

	public static void main(String[] args) {
		String s = "[({[([{}])]})}";
		System.out.println(ispar(s)); // true
	}

	private static boolean ispar(String s) {
		char[] arr = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: arr) {
			if(ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else if(ch == '}' || ch == ')' || ch == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char pop = stack.pop();
				if(ch == '}' && pop == '{') {
					continue;
				}
				if(ch == ')' && stack.pop() == '(') {
					continue;
				}
				if(ch == ']' && stack.pop() == '[') {
					continue;
				} else 
					return false;
			}
		}
		return stack.isEmpty();
	}
}
