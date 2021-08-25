package com.ariv.ds.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralTree {

	private class Node {
		String name;
		List<Node> nodes;

		public Node(String name) {
			this.name = name;
		}

		public Node(String name, List<Node> nodes) {
			this.name = name;
			this.nodes = nodes;
		}
	}

	private Node root;

	public void insert(String name, String[] nodes) {
		List<Node> nodesToAdd = new ArrayList<GeneralTree.Node>();
		for(String node: nodes) {
			nodesToAdd.add(new Node(node));
		}
		Node newNode = new Node(name, nodesToAdd);
		if(root == null) {
			root = newNode;
		} else {
			Node node = findNode(newNode);
		}
	}
	
	private Node findNode(Node newNode) {
		if(root == null)
			return null;
		return find(root, newNode);
	}

	private Node find(Node root, Node newNode) {
		if(root.name.equals(newNode.name))
			return root;
		for(Node node: newNode.nodes) {
			
		}
		return null;
	}

	public static void main(String[] args) {
		GeneralTree gTree = new GeneralTree();
		gTree.insert("L", new String[] {"Rani", "Kumar", "CPayan", "Dans"});
		gTree.insert("Rani", new String[] {"Asai", "Ariv", "Ilaya", "Mathi"});
	}
}
