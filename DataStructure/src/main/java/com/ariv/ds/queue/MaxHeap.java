package com.ariv.ds.queue;

public class MaxHeap {

	private int[] items;
	private int size;
	private int capacity;

	public MaxHeap() {
		this(11);
	}

	public MaxHeap(int capacity) {
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
		// Swap if parent node has less than value since it is max heap.
		while ((index - 1) / 2 >= 0 && items[(index - 1) / 2] < items[index]) {
			int temp = items[(index - 1) / 2];
			items[(index - 1) / 2] = items[index];
			items[index] = temp;
			// Walk upwards
			index = (index - 1) / 2;
		}

	}

	private void heapifyDown() {
		int index = 0;
		while ((2 * index + 1) < size) {
			int largeIndex = 2 * index + 1;
			if ((2 * index + 2) < size && items[2 * index + 2] > items[largeIndex]) {
				largeIndex = 2 * index + 2;
			}

			if (items[index] > items[largeIndex]) {
				break;
			} else {
				int temp = items[index];
				items[index] = items[largeIndex];
				items[largeIndex] = temp;
			}
			index = largeIndex;
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
		MaxHeap heap = new MaxHeap();
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
