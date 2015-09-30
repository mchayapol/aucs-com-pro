package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {
	@Test
	public void testQueue2() {
		// Mix enqueue and dequeue
		Queue queue = new Queue();
		for(int i=0; i<100; i++) {
			int r = (int)(Math.random()*100);
			queue.enqueue(r);
		}
		queue.print();
	}
	
	@Test
	public void testEnqueue() {
		Queue queue = new Queue();
		queue.enqueue(7);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(10);
		queue.enqueue(2);
		queue.enqueue(1);
		assertEquals(6, queue.size());
		
		queue.print();
		
		assertEquals(7, queue.dequeue());
		assertEquals(5, queue.dequeue());
		assertEquals(4, queue.dequeue());
		assertEquals(10, queue.dequeue());
		assertEquals(2, queue.dequeue());
		assertEquals(1, queue.dequeue());
		
		queue.print();	// expect the queue has nothing.
		assertEquals(0, queue.size());
	}



}
