package com.ariv.ds.array;

import com.ariv.ds.base.BaseOperations;

public class Array<T> implements BaseOperations<T> {

	private T[] arr;
	private int size;

	@SuppressWarnings("unchecked")
	public Array(int size) {
		arr = (T[]) new Object[size];
		size = 0;
	}

	/**
	 * 
	 */
	public void add(T t) {
		if (size < 0 || size > arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[size++] = t;
	}

	/**
	 * 
	 */
	public void addAt(int index, T t) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = t;
	}

	/**
	 * 
	 */
	public void remove(T t) {
		for (int i = 0; i < size; ++i) {
			if (arr[i].equals(t)) {
				arr[i] = t;
			}
		}
		return;
	}

	/**
	 * 
	 */
	public void removeAt(int index) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = null;
	}

	/**
	 * 
	 */
	public void updateAt(int index, T t) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = t;
	}

	/**
	 * 
	 */
	public T get(int index) {
		return arr[index];
	}

	/**
	 * 
	 */
	public int size() {
		return size;
	}

	/**
	 * 
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * 
	 */
	public boolean isFull() {
		return isEmpty();
	}

	/**
	 * 
	 */
	public boolean find(T t) {
		for (T ele : arr) {
			if (ele.equals(t)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if (isEmpty())
			return "[]";
		StringBuilder sb = new StringBuilder(size);
		sb.append("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(arr[i] + ", ");
		}
		sb.append(arr[size - 1]);
		sb.append("]");
		return sb.toString();
	}
}
