package com.ariv.ds.queue.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ariv.ds.queue.MinHeap;

public class MinHeapTest {

	private MinHeap minHeap;
	
	@Before
	public void setUp() {
		minHeap = new MinHeap();
	}
	
	@Test
	public void testAdd() {
		minHeap.add(23);
		minHeap.add(5);
		minHeap.add(34);
		minHeap.add(2);
		
		assertEquals(2, minHeap.peek());
	}
	
	@Test
	public void testPoll() {
		minHeap.add(23);
		minHeap.add(5);
		minHeap.add(34);
		minHeap.add(2);
		
		assertEquals(2, minHeap.poll());
		assertEquals(5, minHeap.poll());
		assertEquals(23, minHeap.poll());
		assertEquals(34, minHeap.poll());
		
		try {
			minHeap.poll();
		} catch (IllegalStateException e) {
			//fail(e.getMessage());
		}
	}
}
