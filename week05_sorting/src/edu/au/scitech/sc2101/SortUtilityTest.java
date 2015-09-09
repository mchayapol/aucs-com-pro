package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortUtilityTest {

	@Test
	public void testInsertSort() {
		int[] worstData = {7, 6, 5, 4, 3, 2, 1};
		int[] bestData = {1, 2, 3, 4, 5, 6, 7};
		int[] randomData1 = {2, 1, 3, 6, 7, 5, 4};
		int[] randomData2 = {3, 1, 4, 2, 7, 5, 6};
		int[] expected = {1, 2, 3, 4, 5, 6, 7};

		SortUtility.insertionSort(worstData);		
		assertArrayEquals(expected, worstData);

		SortUtility.insertionSort(bestData);		
		assertArrayEquals(expected, bestData);

		SortUtility.insertionSort(randomData1);		
		assertArrayEquals(expected, randomData1);

		SortUtility.insertionSort(randomData2);		
		assertArrayEquals(expected, randomData2);
	}
	
	//@Test
	public void testSelectionSort() {
		int[] worstData = {7, 6, 5, 4, 3, 2, 1};
		int[] bestData = {1, 2, 3, 4, 5, 6, 7};
		int[] randomData1 = {2, 1, 3, 6, 7, 5, 4};
		int[] randomData2 = {3, 1, 4, 2, 7, 5, 6};
		int[] expected = {1, 2, 3, 4, 5, 6, 7};

		SortUtility.selectionSort(worstData);		
		assertArrayEquals(expected, worstData);

		SortUtility.selectionSort(bestData);		
		assertArrayEquals(expected, bestData);

		SortUtility.selectionSort(randomData1);		
		assertArrayEquals(expected, randomData1);

		SortUtility.selectionSort(randomData2);		
		assertArrayEquals(expected, randomData2);
	}
	
	//@Test
	public void testBubbleSort() {
		int[] worstData = {7, 6, 5, 4, 3, 2, 1};
		int[] bestData = {1, 2, 3, 4, 5, 6, 7};
		int[] randomData1 = {2, 1, 3, 6, 7, 5, 4};
		int[] randomData2 = {3, 1, 4, 2, 7, 5, 6};
		int[] expected = {1, 2, 3, 4, 5, 6, 7};

		SortUtility.bubbleSort(worstData);		
		assertArrayEquals(expected, worstData);

		SortUtility.bubbleSort(bestData);		
		assertArrayEquals(expected, bestData);

		SortUtility.bubbleSort(randomData1);		
		assertArrayEquals(expected, randomData1);

		SortUtility.bubbleSort(randomData2);		
		assertArrayEquals(expected, randomData2);
	}

}
