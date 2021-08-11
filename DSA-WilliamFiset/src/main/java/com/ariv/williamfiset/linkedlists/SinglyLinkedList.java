package com.ariv.williamfiset.linkedlists;

import java.util.Iterator;

@SuppressWarnings("hiding")
public class SinglyLinkedList<T> implements Iterable<T> {

	private int size = 0;
	private Node<T> head = null;

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

		@Override
		public String toString() {
			return data.toString();
		}
	}

	public void clear() {
		Node<T> trav = head;
		while (trav != null) {
			Node<T> next = trav.next;
			trav.next = null;
			trav.data = null;
			trav = next;
		}
		head = null;
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
	 * Add an element to the tail of the linked list Time Complexity: O(1)
	 * 
	 * @param elem
	 */
	public void add(T elem) {
		addLast(elem);
	}

	public void addFirst(T elem) {
		if(isEmpty()) {
			head = new Node<T>(elem, null);
		} else {
			head = new Node<T>(elem, head.next);
		}
		size++;
	}
	
	public void addLast(T elem) {
		Node<T> newElem = new Node<T>(elem, null);
		Node<T> trav = head;
		if(isEmpty()) {
			head = newElem;
		} else {
			trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newElem;
		}
		size++;
	}
	
	public T peekFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		return head.data;
	}
	
	public T peekLast() {
		if(isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		Node<T> trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		return trav.data;
	}
	
	public T removeFirst() {
		if(isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		
		T data = head.data;
		
		head = head.next;
		size--;
		return data;
	}
	
	public T removeLast() {
		if(isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		
		T data = null;
		Node<T> trav = head;
		while(trav.next != null && trav.next.next != null) {
			trav = trav.next;
		}
		data = trav.next.data;
		trav.next = null;
		size--;
		return data;
	}
	
	public T remove(Node<T> node) {
		if(node.next == null) {
			return removeLast();
		}
		T data = node.data;
		node.data = node.next.data;
		node.next = node.next.next;
		size--;
		return data;
	}
	
	public T removeAt(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException();
		}
		if(index == 0) {
			return removeFirst();
		}
		if(index == size-1) {
			return removeLast();
		}
		int i;
		Node<T> trav;
		for(i = 1, trav = head.next; i != index; ++i) {
			trav = trav.next;
		}
		return remove(trav);
	}
	
	public boolean remove(Object obj) {
		Node<T> trav = head;
		if(obj == null) {
			trav = head;
			while(trav != null) {
				if(trav.data == null) {
					remove(trav);
					return true;
				}
				trav = trav.next;
			}
		} else {
			trav = head;
			while(trav != null) {
				if(obj.equals(trav.data)) {
					remove(trav);
					return true;
				}
				trav = trav.next;
			}
		}
		return false;
	}
	
	public int indexOf(Object obj) {
		Node<T> trav = head;
		int index = 0;
		if(obj == null) {
			trav = head;
			while(trav != null) {
				if(trav.data == null) {
					return index;
				}
				trav = trav.next;
				index++;
			}
		} else {
			trav = head;
			while(trav != null) {
				if(obj.equals(trav.data)) {
					return index;
				}
				trav = trav.next;
				index++;
			}
		}
		return index;
	}
	
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
