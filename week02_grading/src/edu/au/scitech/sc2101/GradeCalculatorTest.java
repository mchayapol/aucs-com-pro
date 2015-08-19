package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeCalculatorTest {

	@Test
	public void testAdvGrade() {
		GradeCalculator gc = new GradeCalculator();
		String result = gc.advGrade(100);
		assertEquals("A", result);

		result = gc.advGrade(0);
		assertEquals("F", result);
		
		result = gc.advGrade(81);
		assertEquals("A-", result);

		result = gc.advGrade(67);
		assertEquals("B-", result);

		// Test score out of range
		// Expect grade() to throw java.lang.IllegalArgumentException
		try {
			result = gc.advGrade( -5 );
			fail("grade() accepts -5.");
		} catch(IllegalArgumentException e) {
			// Expect to catch the exception
			// PASS
		}

		try {
			result = gc.advGrade( 101 );
			fail("grade() accepts 101.");
		} catch(IllegalArgumentException e) {
			// Expect to catch the exception
			// PASS
		}

	}

	
	@Test
	public void testGrade() {
		GradeCalculator gc = new GradeCalculator();
		char result = gc.grade(100);
		assertEquals('A', result);

		result = gc.grade(0);
		assertEquals('F', result);
		
		result = gc.grade(30);
		assertEquals('F', result);

		// Test score out of range
		// Expect grade() to throw java.lang.IllegalArgumentException
		try {
			result = gc.grade( -5 );
			fail("grade() accepts -5.");
		} catch(IllegalArgumentException e) {
			// Expect to catch the exception
			// PASS
		}

		try {
			result = gc.grade( 101 );
			fail("grade() accepts 101.");
		} catch(IllegalArgumentException e) {
			// Expect to catch the exception
			// PASS
		}

	}

}
