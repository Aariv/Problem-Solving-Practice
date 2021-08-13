package com.ariv.programiz.ds1;

public class CircularQueue {

	private int SIZE = 5;
	private int rear, front;
	private int[] items;

	public CircularQueue() {
		items = new int[SIZE];
		front = -1;
		rear = -1;
	}

	// Check if the queue is full
	public boolean isFull() {
		if (front == 0 && rear == SIZE - 1) {
			return true;
		}

		if (front == rear + 1) {
			return true;
		}
		return false;
	}

	// Check if the queue is empty
	public boolean isEmpty() {
		if (front == -1)
			return true;
		return false;
	}

	public void enqueue(int ele) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (front == -1)
			front = 0;
		rear = (rear + 1) % SIZE;
		items[rear] = ele;
	}

	public int dequeue() {
		int ele;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		ele = items[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else {
			front = (front + 1) % SIZE;
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
