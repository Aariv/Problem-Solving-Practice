package com.ariv.ds.queue;

import java.util.Arrays;

import com.ariv.ds.QueueOperations;

public class PriorityQueue<E extends Comparable> implements QueueOperations<E> {
	
	private MinHeap<E> minHeap;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PriorityQueue() {
		minHeap = new MinHeap();
	}

	@Override
	public void enqueue(E e) {
		minHeap.add(e);
	}

	@Override
	public E dequeue() {
		return minHeap.poll();
	}

	@Override
	public E peek() {
		return minHeap.peek();
	}

	@Override
	public boolean isEmpty() {
		return minHeap.isEmpty();
	}

	@Override
	public int size() {
		return minHeap.size();
	}

	
}

class MinHeap<E extends Comparable> {
	private int capacity;

	private int size;

	private E[] items;

	public MinHeap() {
		this(11);
	}

	@SuppressWarnings("unchecked")
	public MinHeap(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.items = (E[]) new Comparable[this.capacity];
	}

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return childIndex - 1 / 2;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private E leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}

	private E rightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	private E parent(int index) {
		return items[getParentIndex(index)];
	}

	private void swap(int indexOne, int indexTwo) {
		E temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	private void ensureCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}

	public E peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];
	}

	public E poll() {
		if (size == 0)
			throw new IllegalStateException();
		// remove first element of the heap
		E item = items[0];
		// update the last element to the first
		items[0] = items[size - 1];
		// reduce the size;
		size--;
		heapifyDown();
		return item;
	}

	public void add(E ele) {
		ensureCapacity();
		items[size] = ele;
		size++;
		heapifyUp();
	}

	private void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index).compareTo(items[index]) > 0) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);
		}
	}

	private void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallerChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && rightChild(index).compareTo(leftChild(index)) < 0) {
				smallerChildIndex = getRightChildIndex(index);
			}
			if (items[index].compareTo(items[smallerChildIndex]) < 0) {
				break;
			} else {
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}
}
