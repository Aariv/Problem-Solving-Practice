package com.ariv.williamfiset.stack;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
	
	private Stack<Integer> stack;
	
	@Before
	public void setup() {
		stack = new Stack<Integer>();
		
		stack.push(23);stack.push(24);stack.push(25);
		stack.push(26);stack.push(27);stack.push(28);
	}
	
	@Test
	public void testSize() {
		assertEquals(6, stack.size());
		stack.pop();
		stack.pop();
		stack.pop();
		assertEquals(3, stack.size());
	}
	
}
