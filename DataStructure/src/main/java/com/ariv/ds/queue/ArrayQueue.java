package com.ariv.ds.queue;

import com.ariv.ds.QueueOperations;

public class ArrayQueue<E> implements QueueOperations<E> {

	private E[] arr;
	private int size, capacity;
	private int front, rear;

	public ArrayQueue() {
		this(5);
	}

	@SuppressWarnings("unchecked")
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		this.arr = (E[]) new Object[this.capacity];
		this.size = 0;
		this.front = -1;
		this.rear = -1;
	}

	@Override
	public void enqueue(E ele) {
		arr[++rear] = ele;
	}

	@Override
	public E dequeue() {
		E ele = arr[++front];
		return ele;
	}

	@Override
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E peek() {
		return arr[front];
	}

}
