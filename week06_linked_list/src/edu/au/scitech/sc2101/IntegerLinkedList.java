package edu.au.scitech.sc2101;

public class IntegerLinkedList {
	Node head;
	
	public class Node {
		int value;
		Node next;
		
		// Constructor for this node
		public Node(int v) {
			this.value = v;
			next = null;
		}
	}
	
	// Constructor for this list
	public IntegerLinkedList() {
		// New empty list
		head = null;
	}
	
	public void add(int newValue) {
		Node n = new Node(newValue);
		if (head == null) {
			// new list, just update head
			head = n;
		} else {
			// not new, so find the last node
			Node cur = head;
			// Look ahead
			while( cur.next != null ) {
				cur = cur.next;
			}
			// cur is the last node
			cur.next = n;
		}
	}
	
	public void print() {
		// if empty, head is null
		if(head == null) {
			System.out.println("[ ]");
		} else {
			Node cur = head;
			System.out.print("[ ");
			while( cur != null) {
				System.out.print( cur.value );
				System.out.print(" "); 
				cur = cur.next;
			}
			System.out.println("]");
		}
		
	}
	
	public int size() {
		int s = 0;
		Node cur = head;		
		while( cur != null) {
			cur = cur.next;
			s++;
		}
		return s;
	}
}

