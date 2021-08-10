package com.ariv.williamfiset.queues;

import java.util.Iterator;

import com.ariv.williamfiset.linkedlists.DoublyLinkedList;

public class Queue<T> implements Iterable<T> {
	
	private DoublyLinkedList<T> list;
	
	public Queue() {
		list = new DoublyLinkedList<T>();
	}
	
	public Queue(T firstElem) {
		offer(firstElem);
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
	 * Add at the end of the queue.
	 * Time Complexity: O(1)
	 * 
	 * @param elem
	 */
	public void offer(T elem) {
		list.addLast(elem);
	}

	/**
	 * Remove at the front of the queue.
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T poll() {
		if(isEmpty()) {
			throw new RuntimeException("Empty Queue");
		}
		return list.removeFirst();
	}
	
	/**
	 * Retrive the first element from the queue.
	 * Time Complexity: O(1)
	 * 
	 * @return
	 */
	public T peek() {
		if (isEmpty()) {
			throw new RuntimeException("Empty Queue");
		}
		return list.peekFirst();
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}

}
