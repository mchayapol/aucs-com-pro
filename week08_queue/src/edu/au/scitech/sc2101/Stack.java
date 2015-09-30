package edu.au.scitech.sc2101;

public class Stack extends IntegerLinkedList {

	public void push(int value) {
		add(value);		
	}
	
	public int pop() {
		int value = getNode( size()-1 ).value;
		delete( size()-1 );
		return value;
	}
	
	public int peek() {
		return getNode( size()-1 ).value;		
	}

}
