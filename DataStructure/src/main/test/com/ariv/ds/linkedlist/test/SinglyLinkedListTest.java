package com.ariv.ds.linkedlist.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ariv.ds.linkedlist.SinglyLinkedList;

public class SinglyLinkedListTest {

	@Test
	public void addTest() {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		assertEquals("[20, 30, 40]", list.toString());
		list.addFirst(10);
		assertEquals("[10, 20, 30, 40]", list.toString());
		list.add(2, 15);
		assertEquals("[10, 15, 20, 30, 40]", list.toString());
		list.addLast(50);
		assertEquals("[10, 15, 20, 30, 40, 50]", list.toString());
	}
	
	@Test
	public void removeTest() {
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.add("H");
		list.add("E");
		list.add("L");
		list.add("L");
		list.add("O");
		assertEquals("[H, E, L, L, O]", list.toString());
		assertEquals(5, list.size());
		list.removeFirst();
		assertEquals("[E, L, L, O]", list.toString());
		assertEquals(4, list.size());
		list.removeLast();
		assertEquals("[E, L, L]", list.toString());
		assertEquals(3, list.size());
		list.remove(2);
		assertEquals("[E, L]", list.toString());
		assertEquals(2, list.size());
		list.addFirst("H");
		assertEquals(3, list.size());
		list.remove("E");
		assertEquals("[H, L]", list.toString());
	}
	
}
