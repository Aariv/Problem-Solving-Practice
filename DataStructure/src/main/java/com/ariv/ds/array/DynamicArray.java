package com.ariv.ds.array;

import java.util.Collection;

import com.ariv.ds.base.BaseOperations;

public class DynamicArray<T> implements BaseOperations<T> {

	private T[] arr;
	private int size;
	
	public DynamicArray(Collection<? extends T> c) {
		arr = (T[]) c.toArray();
		size = arr.length;
	}

	@SuppressWarnings("unchecked")
	public DynamicArray(int size) {
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
		// Increase the size if current array is full. 
		if(isFull()) {
			@SuppressWarnings("unchecked")
			T[] newArray = (T[]) new Object[size * 2];
			for(int i = 0; i < size; ++i) {
				newArray[i] = arr[i];
			}
			arr = newArray;
		}
		
		// Insert at provided index
		for(int i = size -1; i >= index; --i) {
			arr[i+1] = arr[i];
		}
		arr[index] = t;
		++size;
	}

	/**
	 * Remove element by value
	 */
	public void remove(T t) {
		int index = find(t);
		if (index != -1) {
			for(int i = index; i <= size; ++i) {
				arr[i] = arr[i+1];
			}
			--size;
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
		for(int i = index; i <= size; ++i) {
			arr[i] = arr[i+1];
		}
		--size;
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
		if (index < 0 || index > size) {
			throw new ArrayIndexOutOfBoundsException();
		}
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
		return size == arr.length;
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
