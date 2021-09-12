package com.ariv.gfg.easy.linkedlist;

import java.util.Stack;

public class _06CheckPalindrome {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(2);
		head.next.next.next = new Node(1);

		boolean result = palindrome(head);

		System.out.println(result);
	}

	private static boolean palindrome(Node head) {
		Node temp = head;
		Stack<Node> stack = new Stack<Node>();
		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}

		temp = head;

		while (temp != null) {
			if(temp.data != stack.pop().data)
				return false;
			temp = temp.next;
		}
		return true;
	}
}
