package com.ariv.programiz.treeds1;

public class PerfectBinaryTree {

	static class Node {
		int key;
		Node left, right;
	}
	
	// Calculate depth
	static int depth(Node node) {
		int d = 0;
		while(node != null) {
			d++;
			node = node.left;
		}
		return d;
	}
	
	// Check if the tree is perfect or not
	static boolean isPerfect(Node root, int d, int level) {
		// Check if the tree is empty
		if(root == null) {
			return true;
		}
		
		// If for children
		if(root.left == null && root.right == null) {
			return (d == level +1);
		}
		
		if(root.left == null || root.right == null) {
			return false;
		}
		return isPerfect(root.left, d, level + 1) && isPerfect(root.right, d, level+1);
	}
}
