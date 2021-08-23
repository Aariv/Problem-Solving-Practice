package com.ariv.ds.queue;

import com.ariv.ds.QueueOperations;

/**
 * Queue Principle : FIFO
 *
 * @param <E>
 */
public class LinkedListQueue<E> implements QueueOperations<E> {

	@SuppressWarnings("hiding")
	private class Node<E> {
		private E data;
		private Node<E> next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node<E> front;
	private Node<E> rear;
	private int size;

	@Override
	public boolean isEmpty() {
		return front == null && rear == null;
	}

	@Override
	public void enqueue(E ele) {
		if (front == null) {
			front = rear = new Node<E>(ele);
		} else {
			rear = new Node<E>(ele, rear.next);
		}
		size++;
	}

	@Override
	public E dequeue() {
		if(isEmpty()) {
			throw new IllegalArgumentException("Empty Queue");
		}
		E ele = front.data;
		front = front.next;
		size--;
		return ele;
	}

	@Override
	public E peek() {
		return front.data;
	}

	@Override
	public int size() {
		return size;
	}
}
