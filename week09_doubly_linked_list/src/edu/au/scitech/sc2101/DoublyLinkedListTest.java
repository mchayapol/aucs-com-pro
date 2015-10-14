package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoublyLinkedListTest {

	@Test
	public void test01() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(10); list.add(5); list.add(7);
		list.add(1); list.add(8);
		
		// expect [10 5 7 1 8]
		String s = list.toString();
		System.out.println(s);
		assertEquals("[10 5 7 1 8]",s);
		
		assertEquals(5, list.size());
	}

	@Test
	public void test02() {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.add(10); list.add(5); list.add(7);
		list.add(1); list.add(8);
		System.out.println("02a:"+list);
		list.delete(0);
		
		String s = list.toString();
		System.out.println("02b:"+s);		
		assertEquals("[5 7 1 8]",s);
		
		assertEquals(4, list.size());
	}
}
