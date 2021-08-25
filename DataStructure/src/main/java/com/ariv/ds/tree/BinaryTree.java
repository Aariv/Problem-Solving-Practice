package com.ariv.ds.tree;

import com.ariv.ds.queue.LinkedListQueue;

public class BinaryTree {

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private static Node root;
	private int size;

	public static void insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return;
		}
		Node temp = root;
		LinkedListQueue<Node> queue = new LinkedListQueue<Node>();
		queue.enqueue(temp);

		while (!queue.isEmpty()) {
			temp = queue.peek();
			queue.dequeue();

			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			} else {
				queue.enqueue(temp.left);
			}

			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			} else {
				queue.enqueue(temp.right);
			}

		}
	}

	public static void main(String[] args) {
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		inorder(root);
		System.out.println();
		insert(root, 45);
		inorder(root);
		System.out.println();
	}

	private static void inorder(Node root) {
		if(root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + ", ");
		inorder(root.right);
	}
}
