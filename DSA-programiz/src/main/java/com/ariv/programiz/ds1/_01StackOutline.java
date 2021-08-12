package com.ariv.programiz.ds1;

public class _01StackOutline {

	/**
	 * Stack Data Structure
	 * 
	 * 	LIFO principle. 
	 * 	Piles of plates on top of another.
	 * 
	 * Basic Operations of Stack
	 *  Push - Add an element to the top of a stack.
	 *  Pop  - Remove an element from the top of a stack.
	 *  IsEmpty - Check if the stack is empty.
	 *  IsFull - Check if the stack is full.
	 *  Peek - Get the value of the top element without removing it.
	 *  
	 *  
	 * Working of Stack Data Structure
	 * 
	 * The operations as follows. 
	 * 
	 * 1. A pointer `top` is used to keep track of the top element in the stack.
	 * 
	 * 2. When initializing the stack we set top's value to -1 so that we can check if the stack is empty by 
	 *    comparing TOP == -1;
	 *    
	 * 3. On pushing an element we increase the value of TOP and place the new element in the position pointed by top
	 *  
	 * 4. On popping an element we return the element pointed by top and reduce its value
	 * 
	 * 5. Before pushing we check if stack is already full
	 * 
	 * 6. Before popping we check if stack is empty
	 * 
	 * Stack Time Complexity:
	 * 
	 * 	For the array based implementation of stack, the pop and push operations take constant time
	 * 
	 * Applications of Stack:
	 * 
	 *  To Reverse a word
	 *  In Compilers
	 *  In Browsers
	 */
}
