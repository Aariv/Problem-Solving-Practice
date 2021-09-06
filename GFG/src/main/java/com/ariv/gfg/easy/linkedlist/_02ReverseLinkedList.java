package com.ariv.gfg.easy.linkedlist;

public class _02ReverseLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		Node result = reverseLinkedList(head);
		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
		System.out.println();
	}

	private static Node reverseLinkedList(Node head) {
		Node temp = head;

		Node prev = null;

		while (temp != null) {
			Node next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		return prev;
	}
}
