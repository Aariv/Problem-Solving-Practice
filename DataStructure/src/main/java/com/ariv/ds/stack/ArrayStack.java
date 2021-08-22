package com.ariv.ds.stack;

import com.ariv.ds.CoreOperations;
import com.ariv.ds.array.UnOrderedArray;

public class ArrayStack<E> implements CoreOperations<E> {
	
	UnOrderedArray<E> stackArray = new UnOrderedArray<E>();
	private int top;
	
	public ArrayStack() {
		this.top = -1;
	}
	
	public void add(E e) {
		stackArray.add(e);
		top++;
	}

	public void add(int pos, E e) {
		//TODO: 
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
		return stackArray.removeLast();
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
		for(int i = 0; i < size(); ++i) {
			if(stackArray.get(i).equals(obj)) {
				return true;
			}
		}
		return false;
	}

	public int indexOf(Object obj) {
		for(int i = 0; i < size(); ++i) {
			if(stackArray.get(i).equals(obj)) {
				return i;
			}
		}
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
		E ele = removeLast();
		top--;
		return ele;
	}
	
	@Override
	public void push(E e) {
		add(e);
	}

	@Override
	public E get(int index) {
		return stackArray.get(index);
	}
}
