package com.ariv.williamfiset.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ariv.williamfiset.linkedlists.SinglyLinkedList;

public class SinglyLinkedListTest {

	private SinglyLinkedList<Integer> list;
	
	@Before
	public void setup() {
		list = new SinglyLinkedList<Integer>();
		list.add(2);list.add(3);list.add(4);
		list.add(5);list.add(6);list.add(7);
	}
	
	@Test
	public void testSize() {
		assertEquals(6, list.size());
		list.removeFirst();
		assertEquals(5, list.size());
	}
	
	@Test
	public void testRemoveFirst() {
		int data = list.peekFirst();
		assertEquals(2, data);
		list.removeFirst();
		list.removeFirst();
		data = list.peekFirst();
		assertEquals(4, data);
	}
	
	@Test
	public void testRemoveLast() {
		int data = list.peekLast();
		assertEquals(7, data);
		list.removeLast();
		list.removeLast();
		data = list.peekLast();
		assertEquals(5, data);
	}
	
	
}
