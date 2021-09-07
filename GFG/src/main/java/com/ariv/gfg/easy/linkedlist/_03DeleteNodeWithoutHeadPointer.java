package com.ariv.gfg.easy.linkedlist;

public class _03DeleteNodeWithoutHeadPointer {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		display(head);
		
		deleteNode(head.next.next);
		
		display(head);
	}

	private static void display(Node head) {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	private static void deleteNode(Node node) {
		node.data = node.next.data;
		node.next = node.next.next;
	}
}
