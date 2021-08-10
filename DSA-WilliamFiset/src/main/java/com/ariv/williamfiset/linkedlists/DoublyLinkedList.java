package com.ariv.williamfiset.linkedlists;

import java.util.Iterator;

@SuppressWarnings("hiding")
public class DoublyLinkedList<T> implements Iterable<T> {

	private int size;

	private Node<T> head = null;
	private Node<T> tail = null;

	// Internal Node to represent the data
	private class Node<T> {
		T data;
		Node<T> prev, next;

		public Node(T data, Node<T> prev, Node<T> next) {
			this.data = data;
			this.prev = prev;
			this.next = next;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	/**
	 * Empty this linked list
	 * 
	 * Time Complexity: O(n)
	 */
	public void clear() {
		Node<T> trav = head;
		while (trav != null) {
			Node<T> next = trav.next;
			trav.prev = trav.next = null;
			trav.data = null;
			trav = next;
		}
		head = tail = trav = null;
		size = 0;
	}

	/**
	 * 
	 * @return the size of the linked list
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 * @return Is this linked list empty
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Add an element to the tail of the linked list 
	 * Time Complexity: O(1)
	 * 
	 * @param elem
	 */
	public void add(T elem) {
		addLast(elem);
	}

	/**
	 * Add an element to the head of the linked list
	 * Time Complexity: O(1)
	 * 
	 * @param elem
	 */
	public void addFirst(T elem) {
		if (isEmpty()) {
			head = tail = new Node<T>(elem, null, null);
		} else {
			head.prev = new Node<T>(elem, null, head);
			head = head.prev;
		}
		size++;
	}

	/**
	 * Add an element to the tail of the linked list
	 * Time Complexity: O(1)
	 * 
	 * @param elem
	 */
	public void addLast(T elem) {
		if (isEmpty()) {
			head = tail = new Node<T>(elem, null, null);
		} else {
			tail.next = new Node<T>(elem, tail, null);
			tail = tail.next;
		}
		size++;
	}

	/**
	 * Get the first node of the list
	 * 
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T peekFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		return head.data;
	}

	/**
	 * Get the last node of the list
	 * 
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T peekLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		return tail.data;
	}

	/**
	 * Remove first node of the list
	 * 
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T removeFirst() {
		// Can't remove data from empty list
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		// Extract the data at the head
		T data = head.data;
		head = head.next;
		size--;
		if (isEmpty()) {
			tail = null;
		} else {
			head.prev = null;
		}
		return data;
	}

	/**
	 * Remove last element of the list
	 * 
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T removeLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}

		T data = tail.data;
		tail = tail.prev;
		size--;
		if (isEmpty()) {
			head = null;
		} else {
			tail.next = null;
		}
		return data;
	}

	/**
	 * Remove arbitrary node from the list
	 * 
	 * Time Complexity: O(1)
	 * 
	 * @param node
	 * @return
	 */
	public T remove(Node<T> node) {
		if (node.prev == null) {
			return removeFirst();
		}
		if (node.next == null) {
			return removeLast();
		}

		node.next.prev = node.prev;
		node.prev.next = node.next;

		T data = node.data;

		// memory clean up
		node.data = null;
		node = node.prev = node.next = null;
		size--;
		return data;
	}

	/**
	 * Remove element at the given index
	 * 
	 * Time Complexity: O(n)
	 * 
	 * @param index
	 * @return
	 */
	public T removeAt(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException();
		}
		int i;
		Node<T> trav;

		// Search from the first of the list
		if (index < size / 2) {
			for (i = 0, trav = head; i != index; ++i) {
				trav = trav.next;
			}
		} else {
			// Search from the back of the list
			for (i = size - 1, trav = tail; i != index; --i) {
				trav = trav.prev;
			}
		}
		return remove(trav);
	}

	/**
	 * Remove the given object from the list.
	 * 
	 * Time Complexity: O(n)
	 * 
	 * @param obj
	 * @return true if the object is removed from the list
	 */
	public boolean remove(Object obj) {
		Node<T> trav = head;
		if (obj == null) {
			for (trav = head; trav != null; trav = trav.next) {
				if (trav.data == null) {
					remove(trav);
					return true;
				}
			}
		} else {
			for (trav = head; trav != null; trav = trav.next) {
				if (obj.equals(trav.data)) {
					remove(trav);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Get the index of provided object
	 * 
	 * Time Complexity: O(n)
	 * 
	 * @param obj
	 * @return
	 */
	public int indexOf(Object obj) {
		int index = 0;
		Node<T> trav = head;

		if (obj == null) {
			for (trav = head; trav != null; trav = trav.next, index++) {
				if (trav.data == null) {
					return index;
				}
			}
		} else {
			for (trav = head; trav != null; trav = trav.next, index++) {
				if (obj.equals(trav.data)) {
					return index;
				}
			}
		}
		return -1;
	}

	/**
	 * 
	 * @param obj
	 * @return true if the object is present in the list
	 * 
	 * Time Complexity: O(n)
	 */
	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private Node<T> trav = head;

			@Override
			public boolean hasNext() {
				return trav != null;
			}

			@Override
			public T next() {
				T data = trav.data;
				trav = trav.next;
				return data;
			}
		};
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		Node<T> trav = head;
		while (trav != null) {
			sb.append(trav.data + ", ");
			trav = trav.next;
		}
		sb.append(" ]");
		return sb.toString();
	}
}
