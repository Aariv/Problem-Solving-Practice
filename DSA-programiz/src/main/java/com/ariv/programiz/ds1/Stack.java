package com.ariv.programiz.ds1;

public class Stack {

	private int[] arr;
	private int top;
	private int capacity;

	// Create a Stack.
	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Push Operation
	public void push(int ele) {
		if (isFull()) {
			System.out.println("Overflow");
			System.exit(1);
		}
		arr[++top] = ele;
	}

	// Pop Operation
	public int pop() {
		if (isEmpty()) {
			System.out.println("Underflow");
			System.exit(1);
		}
		return arr[top--];
	}

	// Check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Return the size of the stack
	public int size() {
		return top + 1;
	}

	// Check if the stack is full
	public boolean isFull() {
		return top == capacity;
	}

	// Print the stack
	public void printStack() {
		for (int i = 0; i <= top; ++i) {
			System.out.print(arr[i] + " ");
		}
	}
}
