package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayExampleTest {
	int[] data1 = {20, 49, 54, 88, 0, 66, 92, 23, 60, 49, 81, 13, 35, 23, 36, 2, 40};
	int[] data2 = {1, 2, 3, 4, 5};
	ArrayExample ae = new ArrayExample();
	
	@Test
	public void testAverage() {
		assertEquals(43*100, (int) (ae.avg(data1)*100) );		
		assertEquals(3*100,  (int) (ae.avg(data2)*100) );
	}
	
	@Test
	public void testSearchMax1() {
		int result = ae.max(data1);
		assertEquals(92, result);		
	}
	
	@Test
	public void testSearchMax2() {
		int result = ae.max(data2);
		assertEquals(5, result);		
	}
	
	@Test
	public void testSearchMin1() {
		int result = ae.min(data1);
		assertEquals(0, result);
	}
	
	@Test
	public void testSearchMin2() {
		int result = ae.min(data2);
		assertEquals(1, result);
	}
	
	@Test
	public void testSum1() {
		int result = ae.sum(data1);
		assertEquals(731, result);
	}

	@Test
	public void testSum2() {
		int[] data = {-1, 0, 1};
		int result = ae.sum(data);
		assertEquals(0, result);
	}

}
