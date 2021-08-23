package com.ariv.ds.stack;

import com.ariv.ds.CoreOperations;
import com.ariv.ds.StackOperations;

public class ArrayStack<E> implements CoreOperations<E>, StackOperations<E> {

	private E[] arr;
	private int top;

	public ArrayStack() {
		this(5);
	}

	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		this.top = -1;
		arr = (E[]) new Object[capacity];
	}

	public void add(E e) {
		arr[++top] = e;
	}

	public void add(int pos, E e) {
		// TODO
	}

	public void addFirst(E e) {
		// TODO

	}

	public void addLast(E e) {
		// TODO

	}

	public E removeFirst() {
		// TODO
		return null;
	}

	public E removeLast() {
		return null;
	}

	public E remove(int index) {
		// TODO
		return null;
	}

	public boolean remove(Object obj) {
		// TODO
		return false;
	}

	public boolean contains(Object obj) {
		return false;
	}

	public int indexOf(Object obj) {
		return -1;
	}

	public void set(int pos, E e) {

	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public E pop() {
		if (isEmpty())
			throw new IllegalArgumentException("Stack overflow");
		E ele = arr[top--];
		return ele;
	}

	@Override
	public void push(E e) {
		add(e);
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E peek() {
		return arr[top];
	}
}
