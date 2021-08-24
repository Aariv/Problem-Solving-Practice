package com.ariv.ds.queue.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ariv.ds.queue.MaxHeap;

public class MaxHeapTest {

	private MaxHeap maxHeap;

	@Before
	public void setUp() {
		maxHeap = new MaxHeap();
	}

	@Test
	public void testAdd() {
		maxHeap.add(23);
		maxHeap.add(5);
		maxHeap.add(34);
		maxHeap.add(2);

		assertEquals(34, maxHeap.peek());
	}

	@Test
	public void testPoll() {
		maxHeap.add(23);
		maxHeap.add(5);
		maxHeap.add(34);
		maxHeap.add(2);

		assertEquals(34, maxHeap.poll());
		assertEquals(23, maxHeap.poll());
		assertEquals(5, maxHeap.poll());
		assertEquals(2, maxHeap.poll());

		try {
			maxHeap.poll();
		} catch (IllegalStateException e) {
			// fail(e.getMessage());
		}
	}
}
