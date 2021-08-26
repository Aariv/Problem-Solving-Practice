package com.ariv.ds.stack;

import com.ariv.ds.StackOperations;

public class LinkedListStack<E> implements StackOperations<E> {

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

	private int top = 0;
	private Node<E> head;
	
	@Override
	public void push(E e) {
		if(head == null) {
			head = new Node<E>(e);
		} else {
			Node<E> newNode = new Node<E>(e);
			newNode.next = head;
			head = newNode;
		}
		top++;
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			throw new IllegalArgumentException("Stack Underflow");
		}
		E ele = head.data;
		head = head.next;
		top--;
		return ele;
	}

	@Override
	public E peek() {
		return head.data;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		return top;
	}

}
