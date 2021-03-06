package com.ariv.williamfiset.arrays;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Array<T> implements Iterable<T> {

	private T[] arr;
	private int length; // the user will know 
	private int capacity; // for the internal 

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
	
	public void add(int index, T ele) {
		if (index >= length && index < 0) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = length - 1; i >= index; --i) {
			arr[i+1] = arr[i];
		}
	}

	public T removeAt(int index) {
		if (index >= length && index < 0) {
			throw new IndexOutOfBoundsException();
		}
		T data = arr[index];
		T[] newArray = (T[]) new Object[length - 1];
		for (int i = 0, j = 0; i < length; i++, j++) {
			if (i == index) {
				j--;
			} else {
				newArray[j] = arr[i];
			}
		}
		arr = newArray;
		length--;
		return data;
	}

	public boolean remove(Object obj) {
		for (int i = 0; i < length; ++i) {
			if (arr[i].equals(obj)) {
				removeAt(i);
				return true;
			}
		}
		return false;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < length; ++i) {
			if (arr[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj) {
		return indexOf(obj) != -1;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < length;
			}

			@Override
			public T next() {
				return arr[index++];
			}
		};
	}

	@Override
	public String toString() {
		if (length == 0) {
			return "[]";
		} else {
			StringBuilder sb = new StringBuilder(length).append("[");
			for (int i = 0; i < length - 1; ++i) {
				sb.append(arr[i] + ",");
			}
			sb.append(arr[length - 1] + "]");
			return sb.toString();
		}
	}
}
