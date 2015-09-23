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
		list.add( 3 );
		list.add( 4 );
		list.print();
		System.out.println("Size: "+list.size());
		
		System.out.println("---- Delete -----------");
		list.delete(1);	// in the list
		list.print();
		list.delete(0); // head
		list.print();
		list.delete(10); // out of bound
		list.print();
		System.out.println("---- Update -----------");
		list.update(1,100);		list.print();
		list.update(0,1000);	list.print();
		list.update(10, 10000);	list.print();
		System.out.println("---- Insert -----------");
		list.insert(1,200);		list.print();
		list.insert(0,2000);	list.print();
		list.insert(10, 20000);	list.print();

	}

}
