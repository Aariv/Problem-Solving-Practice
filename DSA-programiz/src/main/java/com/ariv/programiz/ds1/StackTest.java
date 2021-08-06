package com.ariv.programiz.ds1;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		stack.printStack();
	}
}
