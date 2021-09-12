package com.ariv.gfg.easy.linkedlist;

public class _05FindMiddleElement {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		Node result = findMiddle(head);
		
		System.out.println(result.data);
	}

	private static Node findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
