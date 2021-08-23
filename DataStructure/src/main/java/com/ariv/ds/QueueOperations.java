package com.ariv.ds;

public interface QueueOperations<E> {

	public void enqueue(E e);
	
	public E dequeue();
	
	public E peek();
	
	public boolean isEmpty();
	
	public int size();
}
