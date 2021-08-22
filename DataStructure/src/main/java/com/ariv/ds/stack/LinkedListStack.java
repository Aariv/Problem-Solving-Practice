package com.ariv.ds.stack;

import com.ariv.ds.CoreOperations;
import com.ariv.ds.linkedlist.DoublyLinkedList;

public class LinkedListStack<E> implements CoreOperations<E> {

	private DoublyLinkedList<E> list = new DoublyLinkedList<E>();
	private int top = -1;

	@Override
	public void push(E e) {
		list.addLast(e);
		top++;
	}

	@Override
	public E pop() {
		E ele = list.removeLast();
		top--;
		return ele;
	}

	@Override
	public void add(E e) {
		push(e);
	}

	@Override
	public void add(int pos, E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFirst(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addLast(E e) {
		// TODO Auto-generated method stub

	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		return list.contains(obj);
	}

	@Override
	public int indexOf(Object obj) {
		return list.indexOf(obj);
	}

	@Override
	public void set(int pos, E e) {

	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return size() == -1;
	}

}
