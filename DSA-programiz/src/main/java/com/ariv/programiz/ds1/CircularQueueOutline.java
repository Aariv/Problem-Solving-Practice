package com.ariv.programiz.ds1;

public class CircularQueueOutline {

	/**
	 * How Circular Queue Works?
	 * 
	 * We use modulo division to make a queue to circular.
	 * 
	 * if REAR + 1 == 5 (overflow!), REAR = REAR + 1 % 5 = 0, (Start of queue)
	 * 
	 * Circular Queue Operations:
	 *  1. two pointers FRONT and REAR
	 *  2. FRONT track the first element of the queue
	 *  3. REAR track the last elements of the queue
	 *  4. initially set value of FRONT and REAR to -1
	 *  
	 * 1. Enqueue Operation
	 * ====================
	 * 1. Check if the queue is full
	 * 2. For the first element set the FRONT = 0;
	 * 3. Circular increases the REAR index by 1(i.e if the rear reaches the end, next it would be the start of the queue)
	 * 4. add the new element in the position pointed by the REAR
	 * 
	 * 2. Dequeue Operation:
	 * ====================
	 * 1. Check if the queue is empty
	 * 2. return the value pointed by FRONT
	 * 3. circularly increase the FRONT index by 1
	 * 4. for the last element reset the value of FRONT, REAR to -1
	 * 
	 * Case 1: FRONT = 0 && REAR == SIZE -1
	 * Case 2: FRONT = REAR + 1
	 * 
	 * 3. Complexity Analysis
	 * 
	 * Circular queue operations O(1)
	 * 
	 * 4. Applications:
	 *  CPU Scheduling
	 *  Memory Management
	 *  Traffic Management
	 */
}
