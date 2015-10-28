package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test1() {
		Stack s = new Stack();
		s.push(1000);
		assertEquals("[1000]",s.toString());
		System.out.println(s);
		
		s.push(100);
		assertEquals("[1000 100]",s.toString());
		System.out.println(s);
		s.push(10);
		System.out.println(s);
		s.push(1);
		System.out.println(s);
		
		assertEquals(4, s.size());
		
		assertEquals(1, s.pop());
		System.out.println(s);
		assertEquals(10, s.pop());
		System.out.println(s);
		assertEquals(100, s.pop());
		System.out.println(s);
		assertEquals(1000, s.pop());
		System.out.println(s);
		assertEquals(0, s.size());
	}

}
