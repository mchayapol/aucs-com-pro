package edu.au.scitech.sc2101;

import edu.au.scitech.sc2101.IntegerLinkedList.Node;

public class Queue extends IntegerLinkedList {

	public void enqueue(int value) {
		add(value);
	}
	
	public int dequeue() {
		int value = getNode(0).value;
		delete(0);
		return value;
	}

}
