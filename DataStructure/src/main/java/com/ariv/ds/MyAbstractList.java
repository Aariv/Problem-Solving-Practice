package com.ariv.ds;

public abstract class MyAbstractList<E> implements Iterable<E>{

	public abstract void add(int index, E e);
	
	public abstract void add(E e);

	public abstract void clear();

	public abstract boolean contains(E o);

	public abstract E get(int index);

	public abstract int indexOf(E e);

	public abstract int lastIndexOf(E e);

	public abstract E remove(int index);
	
	public abstract void remove(Object e);

	public abstract Object set(int index, E e);
	
	public abstract int size();

}
