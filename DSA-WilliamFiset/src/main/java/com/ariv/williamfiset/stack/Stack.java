package com.ariv.williamfiset.stack;

import java.util.EmptyStackException;
import java.util.Iterator;

import com.ariv.williamfiset.linkedlists.DoublyLinkedList;

public class Stack<T> implements Iterable<T> {

	private DoublyLinkedList<T> list;

	public Stack() {
		list = new DoublyLinkedList<T>();
	}

	public Stack(T firstElem) {
		push(firstElem);
	}

	/**
	 * Time Complexity O(1)
	 * @return the size of the stack
	 */
	public int size() {
		return list.size();
	}

	/**
	 * Determine if the stack is empty
	 * 
	 * Time Complexity: O(1)
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * Push an element into the stack
	 * 
	 * Time Complexity: O(1)
	 * @param elem
	 */
	public void push(T elem) {
		list.addLast(elem);
	}

	/**
	 * Remove the top of the element from the stack
	 * 
	 * Time Complexity: O(1)
	 */
	public void pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		list.removeLast();
	}

	/**
	 * Retrive the top element 
	 * 
	 * Time Complexity: O(1)
	 */
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return list.peekLast();
	}

	/**
	 * Iterating the list
	 */
	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
