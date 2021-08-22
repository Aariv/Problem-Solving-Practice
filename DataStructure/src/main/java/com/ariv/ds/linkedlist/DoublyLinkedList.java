package com.ariv.ds.linkedlist;

import com.ariv.ds.CoreOperations;

public class DoublyLinkedList<E> implements CoreOperations<E> {

	@SuppressWarnings("hiding")
	private class Node<E> {
		private E data;
		private Node<E> prev;
		private Node<E> next;

		public Node(E data) {
			this.data = data;
		}

		@SuppressWarnings("unused")
		public Node(E data, Node<E> prev, Node<E> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public DoublyLinkedList() {
		this.size = 0;
	}

	public void add(E e) {
		if (head == null) {
			head = tail = new Node<E>(e);
		} else {
			tail.next = new Node<E>(e);
		}
		size++;
	}

	public void add(int pos, E e) {
		if (pos == 1)
			addFirst(e);
		if (pos == size)
			addLast(e);
		Node<E> trav = head;
		int index = 1;
		while (index != pos - 1 && trav != null) {
			trav = trav.next;
		}
		Node<E> newNode = new Node<E>(e);
		newNode.next = trav.next;
		newNode.prev = trav;
		trav.next.prev = newNode;
		trav.next = newNode;
		size++;
	}

	public void addFirst(E e) {
		Node<E> newNode = new Node<E>(e);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
		size++;
	}

	public void addLast(E e) {
		add(e);
	}

	public E removeFirst() {
		if (isEmpty())
			throw new IllegalArgumentException();
		Node<E> ele = head;
		E data = ele.data;
		head = head.next;
		head.prev.next = null;
		head.prev = null;
		size--;
		return data;
	}

	public E removeLast() {
		if (isEmpty())
			throw new IllegalArgumentException();
		E data = tail.data;
		tail = tail.prev;
		tail.next.prev = null;
		tail.next = null;
		size--;
		return data;
	}

	public E remove(int index) {
		if (index == 1)
			removeFirst();
		if (index == size)
			removeLast();

		Node<E> trav = head;
		int i = 1;
		while (i != index - 1 && trav != null) {
			trav = trav.next;
		}

		E ele = trav.next.data;

		trav.next = trav.next.next;
		trav.next.next.prev = trav;
		trav.next.prev = null;
		trav.next.next = null;
		size--;
		return ele;
	}

	public boolean remove(Object obj) {
		Node<E> trav = head;
		int index = 1;
		while (trav != null) {
			if (trav.data.equals(obj)) {
				remove(index);
				return true;
			}
			trav = trav.next;
			index++;
		}
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(int pos, E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

}
