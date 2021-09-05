package com.ariv.gfg.easy.linkedlist;

public class _01MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
		Node head1 = new Node(5);
		head1.next = new Node(10);
		head1.next.next = new Node(15);
		head1.next.next.next = new Node(20);

		Node head2 = new Node(2);
		head2.next = new Node(3);
		head2.next.next = new Node(20);

		Node result = sortedMerge(head1, head2);

		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
		System.out.println();
	}

	// Function to merge two sorted linked list.
	public static Node sortedMerge(Node head1, Node head2) {
		// This is a "method-only" submission.
		// You only need to complete this method
		Node result = new Node(0);

		Node last = result;

		while (true) {
			if (head1 == null) {
				last.next = head2;
				break;
			}
			if (head2 == null) {
				last.next = head1;
				break;
			}

			if (head1.data <= head2.data) {
				last.next = head1;
				head1 = head1.next;
			} else {
				last.next = head2;
				head2 = head2.next;
			}
			last = last.next;
		}
		return result.next;
	}

}

class Node {

	int data;
	Node next;

	public Node() {

	}

	public Node(int data) {
		this.data = data;
	}

}
