package com.ariv.ds.linkedlist;

import com.ariv.ds.CoreOperations;

public class CircularLinkedList<E> implements CoreOperations<E>{

	@SuppressWarnings("hiding")
	private class Node<E>  {
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
	
	private Node<E> last;
	private int size = 0;
	
	public void add(E e) {
		if(last == null) {
			addToEmpty(e);
		} else {
			Node<E> newNode= new Node<E>(e);
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
		size++;
	}

	private Node<E> addToEmpty(E e) {
		if(last != null)
			return last;
		Node<E> newNode = new Node<E>(e);
		last = newNode;
		last.next = last;
		return last;
	}

	public void add(int pos, E e) {
		
	}

	public void addFirst(E e) {
		if(last == null) {
			addToEmpty(e);
		} else {
			Node<E> newNode= new Node<E>(e);
			newNode.next = last.next;
			last.next = newNode;
		}
		size++;
	}

	public void addLast(E e) {
		add(e);
	}

	public E removeFirst() {
		Node<E> lastNext = last.next;
		E ele = lastNext.data;
		last.next = lastNext.next;
		size--;
		return ele;
	}

	public E removeLast() {
		Node<E> trav = last;
		while(trav.next != last) {
			trav = trav.next;
		}
		Node<E> travLast = trav.next;
		E ele = travLast.data;
		trav.next = travLast.next;
		last = trav;
		return ele;
	}

	public E remove(int index) {
		return null;
	}

	public boolean remove(Object obj) {
		return false;
	}

	public boolean contains(Object obj) {
		return false;
	}

	public int indexOf(Object obj) {
		return 0;
	}

	public void set(int pos, E e) {
		
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<E> temp = last.next;
		sb.append("[");
		do {
			sb.append(temp.data + ", ");
			temp = temp.next;
		} while(temp != last);
		sb.append(temp.data + "]");
		return sb.toString();
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}
