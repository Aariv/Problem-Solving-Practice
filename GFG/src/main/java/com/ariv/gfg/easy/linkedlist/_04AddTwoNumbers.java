package com.ariv.gfg.easy.linkedlist;

public class _04AddTwoNumbers {

	public static void main(String[] args) {
		Node head1 = new Node(4);
		head1.next = new Node(5);
//		head1.next.next = new Node(3);
//		head1.next.next.next = new Node(4);

		Node head2 = new Node(3);
		head2.next = new Node(4);
		head2.next.next = new Node(5);
//		head2.next.next.next = new Node(9);
		printList(head1);
		printList(head2);
		Node result = sum(head1, head2);
		printList(result);
	}
	
	private static void printList(Node node) {
		Node result = node;
		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
		System.out.println();
	}

	private static Node sum(Node head1, Node head2) {
		if (head1 == null)
			return head2;

		if (head2 == null)
			return head1;

		// Reverse head1
		head1 = reverse(head1);
		// Reverse head2
		head2 = reverse(head2);
		// sum
		int carry = 0;

		Node dummy = new Node(0);
		Node curr = dummy; // pick this
		while (head1 != null || head2 != null || carry != 0) {
			int sum = 0;

			sum += carry;

			if (head1 != null) {
				sum += head1.data;
				head1 = head1.next;
			}

			if (head2 != null) {
				sum += head2.data;
				head2 = head2.next;
			}
			curr.next = new Node(sum % 10);
			curr = curr.next;
			carry = sum / 10;
		}
		// reverse the result
		return reverse(dummy.next);
	}

	private static Node reverse(Node head1) {
		Node temp = head1;
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
