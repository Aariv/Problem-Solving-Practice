package com.ariv.ds.queue;

public class MaxHeapV2 extends CommonMethods {

	private int capacity;

	public MaxHeapV2() {
		this(11);
	}

	public MaxHeapV2(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.items = new int[this.capacity];
	}

	public void add(int ele) {
		items[size++] = ele;
		heapifyUp();
	}

	private void heapifyUp() {
		// Get the last node
		int index = size - 1;
		// Get the parent of the last node
		// Compare the child node's value and check if the value is maximum
		// Swap if parent node has greater value since it is minheap.
		while (hasParent(index) && getParent(index) < items[index]) {
			int temp = getParent(index);
			items[getParentIndex(index)] = items[index];
			items[index] = temp;
			// Walk upwards
			index = getParentIndex(index);
		}

	}

	private void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallIndex = leftChildIndex(index);
			if (hasRightChild(index) && items[rightChildIndex(index)] > items[smallIndex]) {
				smallIndex = rightChildIndex(index);
			}

			if (items[index] > items[smallIndex]) {
				break;
			} else {
				int temp = items[index];
				items[index] = items[smallIndex];
				items[smallIndex] = temp;
			}
			index = smallIndex;
		}
	}

	public int poll() {
		if (size == 0)
			throw new IllegalStateException();
		int ele = items[0];
		items[0] = items[size - 1];
		size--;
		heapifyDown();
		return ele;
	}

	public int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MaxHeapV2 heap = new MaxHeapV2();
		// 85, 8, 95, 9, 150, 5
		heap.add(85);
		heap.add(8);
		heap.add(95);
		heap.add(9);
		heap.add(150);
		heap.add(5);

		while (!heap.isEmpty()) {
			System.out.print(heap.poll() + ", ");
		}
		System.out.println();
	}
}
