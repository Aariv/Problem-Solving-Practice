package com.ariv.ds.queue;

public class CommonMethods {

	protected int[] items;
	protected int size;
	
	protected int getParent(int index) {
		return items[(index - 1) / 2];
	}
	
	protected int getParentIndex(int index) {
		return (index - 1) / 2;
	}

	protected boolean hasParent(int index) {
		return (index - 1) / 2 >= 0;
	}
	
	protected int rightChildIndex(int index) {
		return 2 * index + 2;
	}

	protected boolean hasRightChild(int index) {
		return (2 * index + 2) < size;
	}

	protected int leftChildIndex(int index) {
		return 2 * index + 1;
	}

	protected boolean hasLeftChild(int index) {
		return (2 * index + 1) < size;
	}
}
