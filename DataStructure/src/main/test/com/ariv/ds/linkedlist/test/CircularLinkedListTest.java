package com.ariv.ds.linkedlist.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.linkedlist.CircularLinkedList;

public class CircularLinkedListTest {

	@Test
	public void testAdd() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(4, list.size());
		assertEquals("[2, 3, 4, 5]", list.toString());
		list.addFirst(1);
		assertEquals("[1, 2, 3, 4, 5]", list.toString());
		list.addLast(6);
		assertEquals("[1, 2, 3, 4, 5, 6]", list.toString());
	}
	
	@Test
	public void testRemove() {
		CircularLinkedList<Integer> list = new CircularLinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		assertEquals(4, list.size());
		assertEquals("[2, 3, 4, 5]", list.toString());
		list.removeFirst();
		assertEquals("[3, 4, 5]", list.toString());
		list.removeLast();
		assertEquals("[3, 4]", list.toString());
	}
}
