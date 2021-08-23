package com.ariv.ds;

public interface StackOperations<E> {

	public void push(E e);
	
	public E pop();
	
	public E peek();
	
	public boolean isEmpty();
	
	public int size();
}
