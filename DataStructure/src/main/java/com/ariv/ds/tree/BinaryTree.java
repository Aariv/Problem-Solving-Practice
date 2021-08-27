package com.ariv.ds.tree;

import com.ariv.ds.stack.LinkedListStack;

public class BinaryTree {

	private static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node root;

	public void inorder() {
		inorder(root);
	}

	public void inorder(Node root) {
		if (root == null)
			return;
		inorder(root.left);
		System.out.print(root.data + ", ");
		inorder(root.right);
	}

	public void inorderIterative(Node root) {
		if (root == null)
			return;

		Node curr = root;
		LinkedListStack<Node> stack = new LinkedListStack<Node>();
		while (!stack.isEmpty() || curr != null) {
			if (curr != null) {
				stack.push(curr);
				curr = curr.left;
			} else {
				curr = stack.pop();
				System.out.print(curr.data + ", ");
				curr = curr.right;
			}
		}
	}
	
	public void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ", ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public void preorderIterative(Node root) {
		if(root == null) {
			return;
		}
		
		Node curr = root;
		LinkedListStack<Node> stack = new LinkedListStack<BinaryTree.Node>();
		
		stack.push(curr);
		
		while(!stack.isEmpty()) {
			curr = stack.pop();
			
			System.out.print(curr.data + ", ");
			
			if(curr.left != null)
				stack.push(curr.left);
			if(curr.right != null)
				stack.push(curr.right);
		}
	}
	
	public void postorder(Node root) {
		if(root == null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + ", ");
	}
	
	public void postorderReverse(Node root) {
		if(root == null)
			return;
		
		postorder(root.right);
		postorder(root.left);
		System.out.print(root.data + ", ");
	}
	
	public void postorderIterative(Node root) {
		if(root == null)
			return;
		
		LinkedListStack<Node> stack1 = new LinkedListStack<BinaryTree.Node>();
		LinkedListStack<Node> stack2 = new LinkedListStack<BinaryTree.Node>();
		
		stack1.push(root);
		
		while(!stack1.isEmpty()) {
			
			Node curr = stack1.pop();
			stack2.push(curr);
			
			if(curr.left != null) {
				stack1.push(curr.left);
			}
			if(curr.right != null) {
				stack1.push(curr.right);
			}
		}
		
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop().data + ", ");
		}
	}
	
	public Node deleteNode(Node root, int key) {
		// Pointer to store the parent of the current node
		Node parent = null;
		
		// Start with root node
		Node curr = root;
		
		// Search a key in the BST and set it's parent pointer
		while(curr != null && curr.data != key) {
			// Update the parent to the current node
			parent = curr;
			
			// if the given key is less than the current node, go to the right subtree
			if(key < curr.data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		// return if the key is not found in the tree
		if(root == null)
			return root;
		
		// CASE 1: Node to be deleted has no children i.e leaf node
		if(curr.left == null && curr.right == null) {
			// if the node to be deleted is not a root node
			// then set it's parent left/right child to null
			if(curr != root) {
				if(parent.left == curr) {
					parent.left = null;
				} else {
					parent.right = null;
				}
			}
			// if the node has only a root node
			else {
				root = null;
			}
		}
		
		// CASE 2: Node to be deleted has two children
		if(curr.left != null && curr.right != null) {
			// Find it's inorder successor node
			Node successor = getMinimumKey(curr.right);
			
			// Store successor value
			int val = successor.data;
			
			// recursively delete the successor. Note the successlor will have at most one child
			deleteNode(root, val);
			
			// Copy the value of successor to the current node
			curr.data = val;
		}
		
		// CASE 3: Node to be deleted has one child
		else {
			Node child = (curr.left != null) ? curr.left : curr.right;
			
			// If the node to be deleted is a root node, set its parent to its child
			if(curr != root) {
				if(curr == parent.left) {
					parent.left = child;
				} else {
					parent.right = child;
				}
			} else {
				root = child;
			}
		}
		return root;
	}

	private Node getMinimumKey(Node right) {
		while(right.left != null) {
			right = right.left;
		}
		return right;
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		System.out.println("INORDER");
		BinaryTree bTree = new BinaryTree();
		bTree.inorder(root);
		System.out.println();
		bTree.inorderIterative(root);
		System.out.println();
		System.out.println();
		
		System.out.println("PREORDER");
		bTree.preorder(root);
		System.out.println();
		bTree.preorderIterative(root);
		System.out.println();
		System.out.println();
		
		System.out.println("POSTORDER");
		bTree.postorder(root);
		System.out.println();
		bTree.postorderReverse(root);
		System.out.println();
		bTree.postorderIterative(root);
		System.out.println();
		System.out.println();
		
		System.out.println("DELETE A NODE");
		
	}
}
