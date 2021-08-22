package com.ariv.ds.stack.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.stack.ArrayStack;

public class ArrayStackTest {

	@Test
	public void testPush() {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		assertEquals(3, stack.size());
		stack.push(40);
	}
	
	@Test
	public void testPop() {
		ArrayStack<Integer> stack = new ArrayStack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		assertEquals(3, stack.size());
		int ele = stack.pop();
		assertEquals(30, ele);
		assertEquals(2, stack.size());
	}
}
