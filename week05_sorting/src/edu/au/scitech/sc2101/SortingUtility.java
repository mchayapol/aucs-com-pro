package edu.au.scitech.sc2101;

import java.util.Arrays;

public class SortingUtility {
	public static void quickSort(int[] arr, int startIndex, int endIndex) {
		System.out.println( Arrays.toString( arr ) );
		
		int pivotIndex = (startIndex + endIndex) / 2;

		int i = startIndex;
		int j = endIndex;
		
		while( !(i > j) ) {
			// travel from LHS (i)
			while( arr[i] < arr[pivotIndex] )
				i++;
			
			// travel from RHS (j)
			while( arr[j] > arr[pivotIndex] )
				j--;
			
			System.out.printf("%d %d\n", i, j);
			
			// swap the numbers
			if (i <= j) {
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
				System.out.println( Arrays.toString( arr ) );
			}
		}
		
		// divide 2 chunks of array
		// [startIndex .. j] and [i .. endIndex]
		if (startIndex < j) {
			System.out.printf("Dividing %d-%d",startIndex, j);
			quickSort(arr, startIndex, j);
		}
		
		if (i < endIndex) {
			System.out.printf("Dividing %d-%d",i, endIndex);
			quickSort(arr, i, endIndex);
		}
		
		
	}
}
