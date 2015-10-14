package edu.au.scitech.sc2101;

public class DoublyLinkedList {
	Node head;
	Node last;
	
	public DoublyLinkedList() {
		head = last = null;
	}
	
	public void add(int i) {
		Node n = new Node(i);
		
		// Case 1: empty list
		if (head == null && last == null) {
			head = n;
			last = n;
		}
		// Case 2: not empty list
		else {
			last.next = n;
			n.prev = last;
			last = n;
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node cur = head;
		while(cur != null) {
			if(cur != head) sb.append(" ");
			sb.append(cur.data);
			cur = cur.next;
		}
		sb.insert(0, "[");
		sb.append("]");
		return sb.toString();
	}
	
	public int size() {
		int count = 0;
		Node cur = head;
		while(cur != null) {
			count++;
			cur = cur.next;
		}
		return count;
	}
	
	public void delete(int index) {
		// walk through the list until index
		Node cur = head;
		// find the index
		for(int i=0; i<index; i++) {
			// Index out of bound, nothing to delete
			if (cur == null) return;
			cur = cur.next;
		}
		
		// case 1: delete at head
		if (cur == head) {
			head = head.next;
			head.prev = null;
			cur.next = null;
		}  
		// case 2: delete at last
		else if (cur == last) {
			last = last.prev;
			last.next = null;
			cur.prev = null;
		}
		// case 3: delete immediate node
		else {
			Node curp = cur.prev;
			Node curn = cur.next;
			curp.next = curn;
			curn.prev = curp;
			cur.prev = cur.next = null;
		}

	}

	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}

}
