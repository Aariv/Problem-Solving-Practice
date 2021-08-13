package com.ariv.programiz.ds1;

public class Queue {

	private int size = 5;
	private int[] items;
	private int front, rear;

	public Queue() {
		items = new int[size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (front == -1)
			front = 0;
		rear++;
		items[rear] = ele;
	}

	public int dequeue() {
		int ele;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		ele = items[front];
		if (front >= rear) {
			front = -1;
			rear = -1;
		} else {
			front++;
		}
		return ele;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = front; i < rear; ++i) {
			sb.append(items[i]).append(",");
		}
		sb.append(items[rear]);
		return sb.toString();
	}
}
