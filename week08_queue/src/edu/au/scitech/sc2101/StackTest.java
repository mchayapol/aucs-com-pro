package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test1() {
		Stack s = new Stack();
		s.push(1000);	s.print();
		s.push(100);	s.print();
		s.push(10);		s.print();
		s.push(1);		s.print();
		
		assertEquals(4, s.size());
		
		assertEquals(1, s.pop());	s.print();
		assertEquals(10, s.pop());	s.print();
		assertEquals(100, s.pop());	s.print();
		assertEquals(1000, s.pop());s.print();
		assertEquals(0, s.size());
	}

}
