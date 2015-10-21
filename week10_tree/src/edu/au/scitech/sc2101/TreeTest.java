package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTest {

	@Test
	public void test1() {
		// Cannot use primitive type for generic
		//Tree<int> tree = new Tree<int>();
		Tree<Integer> tree = new Tree<Integer>();
		// Test data = 1 2 3 4 5 6 7 8 9
		tree.add(1); tree.add(2); tree.add(3);
		assertEquals(3, tree.size());
		assertEquals(3, tree.depth());
		
		tree.add(4); tree.add(5); tree.add(6);
		assertEquals(6, tree.size());
		assertEquals(6, tree.depth());
		
		tree.add(7); tree.add(8); tree.add(9);
		assertEquals(9, tree.size());
		assertEquals(9, tree.depth());
	}

}
