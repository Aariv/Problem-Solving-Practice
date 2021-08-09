package com.ariv.williamfiset.linkedlists;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

	private int size;
	
	private Node<T> head = null;
	private Node<T> tail = null;
	
	private class Node<T> {
		T data;
		Node<T> prev, next;
	}
	
	@Override
	public Iterator<T> iterator() {
		return null;
	}

}
