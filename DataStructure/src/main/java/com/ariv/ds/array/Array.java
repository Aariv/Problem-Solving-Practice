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
	 * Add an element at the end of the array
	 */
	public void add(T t) {
		if (size < 0 || size > arr.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[size++] = t;
	}

	/**
	 * Add an element at the provided index. 
	 */
	public void addAt(int index, T t) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = t;
		++size;
	}

	/**
	 * Remove element by value
	 */
	public void remove(T t) {
		for (int i = 0; i < size; ++i) {
			if (arr[i].equals(t)) {
				arr[i] = null;
				--size;
			}
		}
		return;
	}

	/**
	 * Remove value by index
	 */
	public void removeAt(int index) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = null;
		size--;
	}

	/**
	 * Update value based on the index provided.
	 */
	public void updateAt(int index, T t) {
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		arr[index] = t;
	}

	/**
	 * Retrieve on given index
	 */
	public T get(int index) {
		return arr[index];
	}

	/**
	 * Get the size of the Array
	 */
	public int size() {
		return size;
	}

	/**
	 * Determine whether array is empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Determine whether array is full
	 */
	public boolean isFull() {
		return isEmpty();
	}

	/**
	 * Determine element is available in the array
	 */
	public int find(T t) {
		for (int i = 0; i <= size; ++i) {
			if (arr[i].equals(t)) {
				return i;
			}
		}
		return -1;
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
