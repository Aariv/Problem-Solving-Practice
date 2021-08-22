package com.ariv.ds.linkedlist;

import com.ariv.ds.CoreOperations;

public class SinglyLinkedList<E> implements CoreOperations<E> {

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

	private Node<E> head;
	private int size;

	public SinglyLinkedList() {
		size = 0;
	}

	public void add(E e) {
		if (head == null) {
			addFirst(e);
		} else {
			addLast(e);
		}
	}

	public void add(int pos, E e) {
		if (pos > size && pos < 1) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		int i = 1;
		while (i != pos - 1 && trav != null) {
			trav = trav.next;
		}
		trav.next = new Node<E>(e, trav.next);
		size++;
	}

	public void addFirst(E e) {
		if (head == null) {
			head = new Node<E>(e);
		} else {
			head = new Node<E>(e, head);
		}
		size++;
	}

	public void addLast(E e) {
		if (head == null) {
			addFirst(e);
		} else {
			Node<E> trav = head;
			while (trav != null && trav.next != null) {
				trav = trav.next;
			}
			// append to the last node
			trav.next = new Node<E>(e);
		}
		size++;
	}

	public E removeFirst() {
		if (isEmpty()) {
			throw new IllegalArgumentException();
		}
		E ele = head.data;
		head = head.next;
		size--;
		return ele;
	}

	public E removeLast() {
		if (isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		if(trav.next == null) {
			return removeFirst();
		}
		Node<E> prev = null;
		while (trav != null && trav.next != null) {
			prev = trav;
			trav = trav.next;
		}
		E ele = prev.next.data;
		prev.next = null;
		size--;
		return ele;
	}

	public E remove(int index) {
		if(index > size && index < 1) {
			throw new IllegalArgumentException();
		}
		if(index == 1) {
			return removeFirst();
		}
		if(index == size) {
			return removeLast();
		}
		Node<E> trav = head;
		Node<E> prev = null;
		for(int i = 1; i != index; ++i) {
			prev = trav;
			trav = trav.next;
		}
		E data = trav.data;
		prev.next = trav.next;
		size--;
		return data;
	}

	public boolean remove(Object obj) {
		if(isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		Node<E> prev = null;
		while(trav != null && !trav.data.equals(obj)) {
			prev = trav;
			trav = trav.next;
		}
		boolean result = false;
		if(prev == null && trav.data.equals(obj)) {
			removeFirst();
			result = true;
		} else {
			prev.next = trav.next;
			result = true;
			size--;
		}
		return result;
	}

	public boolean contains(Object obj) {
		if(isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		while(trav != null) {
			if(trav.data.equals(obj)) {
				return true;
			}
			trav = trav.next;
		}
		return false;
	}

	public int indexOf(Object obj) {
		if(isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		int index = 1;
		while(trav != null) {
			if(trav.data.equals(obj)) {
				return index;
			}
			trav = trav.next;
			index++;
		}
		return -1;
	}

	public void set(int pos, E e) {
		if (pos > size && pos < 1) {
			throw new IllegalArgumentException();
		}
		Node<E> trav = head;
		int i = 1;
		while (i != pos && trav != null) {
			trav = trav.next;
		}
		trav.data = e;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		StringBuilder sb = new StringBuilder("[");
		Node<E> trav = head;
		while (trav != null && trav.next != null) {
			sb.append(trav.data + ", ");
			trav = trav.next;
		}
		sb.append(trav.data + "]");
		return sb.toString();
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
