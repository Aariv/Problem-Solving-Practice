package com.ariv.ds;

public interface CoreOperations<E> {

	public void add(E e);
	
	public void add(int pos, E e);
	
	public void addFirst(E e);
	
	public void addLast(E e);
	
	public E removeFirst();
	
	public E removeLast();
	
	public E remove(int index);
	
	public boolean remove(Object obj);
	
	public boolean contains(Object obj);
	
	public int indexOf(Object obj);
	
	public void set(int pos, E e);
	
	public int size();
	
	public boolean isEmpty();
	
}
