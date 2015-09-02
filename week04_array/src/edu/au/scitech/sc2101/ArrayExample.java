package edu.au.scitech.sc2101;

public class ArrayExample {
	int sum(int[] arr) {
		int sum = 0;
		/* Traditional style
		for(int i=0; i<arr.length; i++) {
			//sum = sum + arr[i];
			sum += arr[i];
		}
		*/
		// Enhanced for-loop (for each)
		for(int x: arr) {
			sum += x;
		}
		
		return sum;		
	}

	public int min(int[] arr) {
		int min = arr[0];
		for(int x: arr) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}
}
