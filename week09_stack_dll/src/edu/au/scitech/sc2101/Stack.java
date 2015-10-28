package edu.au.scitech.sc2101;

public class Stack extends DoublyLinkedList {

	public void push(int i) {
		add(i);		
	}

	public int pop() {
		int data = get( size() - 1 );
		delete( size() - 1 );
		return data;
	}

	
	@Override
	public String toString() {
		return super.toString();
	}
}
