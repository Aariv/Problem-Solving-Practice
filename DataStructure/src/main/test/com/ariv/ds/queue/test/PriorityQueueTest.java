package com.ariv.ds.queue.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.queue.PriorityQueue;

public class PriorityQueueTest {

	@Test
	public void testEnqueue() {
		PriorityQueue<Integer> intList = new PriorityQueue<Integer>();
		
		intList.enqueue(100);
		intList.enqueue(35);
		intList.enqueue(40);
		intList.enqueue(18);
		intList.enqueue(38);
		
		assertEquals(5, intList.size());
	}
	
	@Test
	public void testDequeue() {
		PriorityQueue<Integer> intList = new PriorityQueue<Integer>();
		
		intList.enqueue(100);
		intList.enqueue(35);
		intList.enqueue(40);
		intList.enqueue(18);
		intList.enqueue(38);
		
		int ele = intList.dequeue();
		
		assertEquals(18, ele);
	}
}
