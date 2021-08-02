package com.ariv.ds.base;

public interface BaseOperations<T> {

	public void add(T t);

	public void addAt(int index, T t);

	public void remove(T t);

	public void removeAt(int index);

	public void updateAt(int index, T t);

	public T get(int index);

	public int size();

	public boolean isEmpty();

	public boolean isFull();
	
	public boolean find(T t);
	
}
