package edu.au.scitech.sc2101;

import java.util.Arrays;

public class SortUtility {
	public static void insertionSort(int[] arr) {
		
	}
	
	public static void selectionSort(int[] arr){
		System.out.println(Arrays.toString(arr));
		int counter = 0;
		boolean swapRequired = false;
		for(int i = 0 ; i < arr.length-1; i++){
			int minArrIndex = i;
			swapRequired = false;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[minArrIndex]){
					minArrIndex = j;
					swapRequired = true;
				}	
				counter++;
			}
			if (swapRequired) {
				int temp = arr[i];
				arr[i] = arr[minArrIndex];
				arr[minArrIndex]= temp;
				System.out.println(Arrays.toString(arr));
			} 
		}	
		System.out.println(Arrays.toString(arr));		
		System.out.println("#"+counter);
	}
	
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
