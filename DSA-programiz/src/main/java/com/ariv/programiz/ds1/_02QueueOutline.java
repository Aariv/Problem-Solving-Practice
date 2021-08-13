package com.ariv.programiz.ds1;

public class _02QueueOutline {

	/**
	 * Similar to Ticket Queue where the first person entering the queue is getting the ticket.
	 * 
	 * FIFO(First In First Out) principle.
	 * 
	 * Terminology:
	 * 	Putting an elmement into a queue called `enqueue`
	 *  Removing an element from a queue called `dequeue`
	 *  
	 * Basic Operations Of Queue
	 * 
	 *  Enqueue: Add an element to the end of the queue
	 *  Dequeue: Remove an element to the front of the queue.
	 *  IsEmpty: Check if the queue is empty
	 *  IsFull : Check if the queue is full
	 *  Peek   : Get the value of the front of the queue.
	 *  
	 * Working of a Queue
	 *  Queue operations work as follows
	 *  
	 *  two pointers FRONT and REAR
	 *  FRONT tracks the first element of the queue.
	 *  REAR tracks the last element of the queue.
	 *  
	 *  Initially set value FRONT and REAR = -1
	 *  
	 *  Enqueue Operation:
	 *   Check if the queue is full
	 *   for the first element set the value FRONT = 0
	 *   increase the REAR index by 1
	 *   Add new element pointed by REAR
	 *   
	 *  Dequeue Operation:
	 *   Check if the queue is empty
	 *   return the value pointed by FRONT
	 *   increase the FRONT index by 1
	 *   for the last element reset values of FRONT and REAR = -1
	 *   
	 *  Implementation of Queue
	 *  
	 *  Limitation of Queue
	 *   Since we reset FRONT, REAR to -1, unable to make use of the empty spaces once queue becomes empty.
	 *   to resolve this we can make Circular Queue.
	 *  
	 *  Complexity Analysis
	 *   Using array 
	 *    enqueue - O(1)
	 *    dequeue - O(1)
	 *    
	 *  Applications:
	 *  	CPU Scheduling
	 *      Queue is used for synchronization IO Buffers, pipes etc
	 *      Handling of interrupts in OS
	 *      Call center phone systems.
	 */
}
