package com.ariv.programiz.ds1;

public class QueueTest {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(12);
		queue.enqueue(13);
		
		queue.enqueue(14);
		queue.enqueue(15);
		queue.enqueue(16);
		
		System.out.println(queue);
		
		queue.enqueue(17);
	}
}
