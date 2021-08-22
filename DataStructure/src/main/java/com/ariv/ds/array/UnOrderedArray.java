package com.ariv.ds.array;

import com.ariv.ds.CoreOperations;

public class UnOrderedArray<E> implements CoreOperations<E> {

	private E[] arr;
	private int size;
	private int capacity;

	public UnOrderedArray() {
		this(5);
	}

	@SuppressWarnings("unchecked")
	public UnOrderedArray(int capacity) {
		this.capacity = capacity;
		this.arr = (E[]) new Object[this.capacity];
		this.size = 0;
	}

	public void add(E e) {
		arr[size++] = e;
	}

	public void add(int pos, E e) {
		for (int i = size - 1; i >= pos; --i) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = e;
		size++;
	}

	public void addFirst(E e) {
		add(0, e);
	}

	public void addLast(E e) {
		add(e);
	}

	public E removeFirst() {
		E elem = arr[0];
		for (int i = 0; i < size - 1; ++i) {
			arr[i] = arr[i + 1];
		}
		size--;
		return elem;
	}

	public E removeLast() {
		E elem = arr[size - 1];
		size--;
		return elem;
	}

	public E remove(int index) {
		E elem = arr[index];
		for (int i = index; i < size; ++i) {
			arr[i] = arr[i + 1];
		}
		size--;
		return elem;
	}

	public boolean remove(Object obj) {
		int pos = indexOf(obj);
		if (pos != -1) {
			remove(pos);
			return true;
		}
		return false;
	}

	public boolean contains(Object obj) {
		for (int i = 0; i < size; ++i) {
			if (obj.equals(arr[i])) {
				return true;
			}
		}
		return false;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < size; ++i) {
			if (obj.equals(arr[i])) {
				return i;
			}
		}
		return -1;
	}

	public void set(int pos, E e) {
		arr[pos] = e;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public String toString() {
		if (size() == 0)
			return "[]";
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(arr[i] + ", ");
		}
		sb.append(arr[size - 1] + "]");
		return sb.toString();
	}

	@Override
	public E get(int index) {
		return arr[index];
	}
}
