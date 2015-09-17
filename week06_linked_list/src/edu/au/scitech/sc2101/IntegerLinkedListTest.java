package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegerLinkedListTest {

	@Test
	public void test1() {
		IntegerLinkedList list = new IntegerLinkedList();
		list.add( 10 );
		list.add( 5 );
		list.add( 1 );
		list.print();
		System.out.println("Size: "+list.size());
	}

}
