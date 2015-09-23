package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortingUtilityTest {

	@Test
	public void testQuickSort() {
		int[] randomData1 =  {1, 12, 5, 26, 7, 14, 3, 7, 2};
		int[] expected = {1,2,3,5,7,7,12,14,26};
		
		SortingUtility.quickSort(randomData1, 0, randomData1.length-1);
		assertArrayEquals(expected,randomData1);
	}

}
