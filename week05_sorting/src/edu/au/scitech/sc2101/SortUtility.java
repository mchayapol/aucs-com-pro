package edu.au.scitech.sc2101;

import java.util.Arrays;

public class SortUtility {
	/* Make the method static, because it doesn't
	 * require state of data. 
	 * It is called once and done. 
	*/
	public static void bubbleSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int counter = 0;
		boolean swapHappen = false;
		for(int i=0; i<arr.length-1; i++) {
			swapHappen = false;
			for(int j=0; j<arr.length-1; j++) {
				counter++;
				if (arr[j] > arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapHappen = true;
				}				
			}
			if ( !swapHappen ) break;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("#"+counter);

	}


}
