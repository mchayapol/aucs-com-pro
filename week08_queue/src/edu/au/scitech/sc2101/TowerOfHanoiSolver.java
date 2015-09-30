package edu.au.scitech.sc2101;

public class TowerOfHanoiSolver {

	Stack tower1 = new Stack();
	Stack tower2 = new Stack();
	Stack tower3 = new Stack();

	public TowerOfHanoiSolver() {
		// ... no idea
	}
	
	public void addValues(int[] values) {
		// We need to sort the numbers 
		// into the stack.
		SortUtility.bubbleSort(values);
		for(int i = values.length-1;
			i >= 0;
			i--) {
			tower1.push( values[i] );
		}
		print();
	}
	
	public void run() {
		// starting numbers
		int startingNumber = tower1.size();		
		int round = 1;
		while(tower3.size() != startingNumber) {
			while (tower1.size() > 0) {
				int value = tower1.pop();
				// search for the next tower
				// it has to be smallest 
				// for that tower
				if (tower2.size() == 0 || value <= tower2.peek()) {
					tower2.push(value);
				} else if (tower3.size() == 0 || value <= tower3.peek()) {
						tower3.push(value);
				} else {
					tower1.push(value);
					break;
				}
			}
			
			while(tower2.size() > 0) {
				int value = tower2.pop();
				if (tower3.size() == 0 || value <= tower3.peek()) {
					tower3.push(value);
				} else if (tower1.size() == 0 || value <= tower1.peek()) {
					tower1.push(value);
				} else {
					tower2.push(value);
					break;
				}
			}
			
			while(tower3.size() > 0) {
				int value = tower3.pop();
				if (tower1.size() == 0 || value <= tower1.peek()) {
					tower1.push(value);
				} else if (tower2.size() == 0 || value <= tower2.peek()) {
					tower2.push(value);
				} else {
					tower3.push(value);
					break;
				}
			}
			System.out.println("----- Round "+round);
			print();
			round++;
		}
		System.out.println("-- Game End ---");
		print();
	}
	
	public void print() {
		System.out.print("Tower1: ");
		tower1.print();
		System.out.print("Tower2: ");
		tower2.print();
		System.out.print("Tower3: ");
		tower3.print();
		
	}
}
