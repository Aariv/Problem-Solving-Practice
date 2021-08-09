package com.ariv.williamfiset.arrays;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Array<T> implements Iterable<T> {

	private T[] arr;
	private int length;
	private int capacity;

	public Array() {

	}

	public Array(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);

		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}

	public int size() {
		return length;
	}

	@Override
	public Iterator<T> iterator() {
		return null;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public T get(int index) {
		return arr[index];
	}

	public void set(int index, T ele) {
		arr[index] = ele;
	}

	public void clear() {
		for (int i = 0; i < length; ++i) {
			arr[i] = null;
		}
		length = 0;
	}

	public void add(T ele) {
		// Time to resize
		if (length + 1 <= capacity) {
			if (capacity == 0) {
				capacity = 1;
			} else {
				capacity *= 2;
			}

			T[] newArray = (T[]) new Object[capacity];
			for (int i = 0; i < length; ++i) {
				newArray[i] = arr[i];
			}

			arr = newArray;
		}
		arr[length++] = ele;
	}
}
