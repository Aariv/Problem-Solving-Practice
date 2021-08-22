package com.ariv.ds.stack.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.stack.LinkedListStack;

public class LinkedListStackTest {

	@Test
	public void pushTest() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		assertEquals(4, stack.size());
	}
	
	@Test
	public void popTest() {
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		assertEquals(4, stack.size());
		
		int ele = stack.pop();
		
		assertEquals(40, ele);
	}
}
