package com.ariv.williamfiset.queue;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ariv.williamfiset.queues.Queue;

public class QueueTest {
	private Queue<Integer> queue;

	@Before
	public void setup() {
		queue = new Queue<Integer>();

		queue.offer(23);queue.offer(24);queue.offer(25);
		queue.offer(26);queue.offer(27);queue.offer(28);
	}

	@Test
	public void testSize() {
		assertEquals(6, queue.size());
		queue.poll();
		queue.poll();
		assertEquals(4, queue.size());
		queue.poll();
		queue.poll();
		queue.poll();
		assertEquals(1, queue.size());
	}

	@Test
	public void testPeek() {
		int result = queue.peek();
		assertEquals(23, result);
		queue.poll();
		queue.poll();
		result = queue.peek();
		assertEquals(25, result);
		queue.poll();
		queue.poll();
		result = queue.peek();
		assertEquals(27, result);
	}
}
