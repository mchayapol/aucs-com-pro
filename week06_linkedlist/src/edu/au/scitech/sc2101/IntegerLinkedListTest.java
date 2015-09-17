package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerLinkedListTest {

	@Test
	public void test() {
		IntegerLinkedList list = new IntegerLinkedList();
		list.add(5);
		list.add(10);		
		list.add(1);
		list.add(2);
		list.add(20);
		list.add(19);
		list.add(0);
		list.add(8);
		list.print();
	}

}
