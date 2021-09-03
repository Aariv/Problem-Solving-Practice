package com.ariv.ds;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyDoublyLinkedList<E> extends MyAbstractList<E> implements Cloneable {
	private Node<E> head = new Node<E>(null);
	private int size;

	/** Create a default list */
	public MyDoublyLinkedList() {
		size = 0;
		head.next = head;
		head.previous = head;
	}

	private static class Node<E> {
		E element;
		Node<E> previous;
		Node<E> next;

		public Node(E element) {
			this.element = element;
		}
	}

	public String toString() {
		StringBuilder result = new StringBuilder("[");

		Node<E> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			if (current != head) {
				result.append(", "); // Separate two elements with a comma
			}
		}
		result.append("]"); // Insert the closing ] in the string

		return result.toString();
	}

	private Node<E> getNode(int index) {
		Node<E> current = head;
		if (index < size / 2)
			for (int i = -1; i < index; i++)
				current = current.next;
		else
			for (int i = size; i > index; i--)
				current = current.previous;
		return current;
	}

	@Override
	public void add(int index, E e) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		Node<E> prev = getNode(index - 1);
		Node<E> next = prev.next;
		Node<E> newNode = new Node<E>(e);
		prev.next = newNode;
		next.previous = newNode;
		newNode.previous = prev;
		newNode.next = next;
		size++;
	}
	
	@Override
	public void add(E e) {
		if (isEmpty()) {
			head = new Node<E>(e);
		} else {
			Node<E> trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = new Node<E>(e);
		}
		size++;
	}

	private boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void clear() {

	}

	@Override
	public boolean contains(E o) {
		for (Node<E> current = head.next; current != head; current = current.next) {
			E e = current.element;
			if (o == null ? e == null : o.equals(e))
				return true;
		}
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		int index = 0;
		Node<E> trav = head;

		if (e == null) {
			for (trav = head; trav != null; trav = trav.next, index++) {
				if (trav.element == null) {
					return index;
				}
			}
		} else {
			for (trav = head; trav != null; trav = trav.next, index++) {
				if (e.equals(trav.element)) {
					return index;
				}
			}
		}
		return -1;
	}

	@Override
	public int lastIndexOf(E e) {
		return 0;
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public Object set(int index, E e) {
		return null;
	}

	public E getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		return head.element;
	}

	public E getLast() {
		if (isEmpty()) {
			throw new RuntimeException("Empty List");
		}
		Node<E> trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		return trav.element;
	}

	public void addFirst(E e) {
		add(0, e);
	}

	public void addLast(E e) {
		// TODO Auto-generated method stub

	}

	public E removeFirst() {
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public E removeLast() {
		if (size == 0) {
			throw new NoSuchElementException();
		} else {
			// TODO Auto-generated method stub
			return null;
		}
	}

	public ListIterator<E> listIterator(int index) {
		return new MyDoublyLinkedListIterator(index);
	}

	private static enum ITERATOR_STATE {
		CANNOT_REMOVE, CAN_REMOVE_PREV, CAN_REMOVE_CURRENT
	};

	private class MyDoublyLinkedListIterator implements ListIterator<E> {
		private Node<E> current; // node that holds the next element in the
									// iteration
		private int nextIndex; // index of current
		ITERATOR_STATE iterState = ITERATOR_STATE.CANNOT_REMOVE;

		private MyDoublyLinkedListIterator(int index) {
			if (index < 0 || index > size)
				throw new IndexOutOfBoundsException("iterator index out of bounds");
			current = getNode(index);
			nextIndex = index;
		}

		@Override
		public void add(E arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public boolean hasNext() {
			return nextIndex < size;
		}

		@Override
		public boolean hasPrevious() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public E next() {
			if (nextIndex >= size)
				throw new NoSuchElementException();
			E returnVal = current.element;
			current = current.next;
			nextIndex++;
			iterState = ITERATOR_STATE.CAN_REMOVE_PREV;
			return returnVal;
		}

		@Override
		public int nextIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public E previous() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int previousIndex() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void remove() {
			switch (iterState) {
			case CANNOT_REMOVE:
				// ...
				break;
			case CAN_REMOVE_PREV:
				// ...
				break;
			case CAN_REMOVE_CURRENT:
				// ...
				break;
			}

		}

		@Override
		public void set(E arg0) {
			// TODO Auto-generated method stub

		}
	}

	@Override
	public Iterator<E> iterator() {
		return listIterator();
	}

	public java.util.ListIterator<E> listIterator() {
		return listIterator(0);
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void remove(Object e) {
		// TODO Auto-generated method stub
		
	}
}