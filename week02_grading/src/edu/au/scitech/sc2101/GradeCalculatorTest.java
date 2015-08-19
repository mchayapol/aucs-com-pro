package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class GradeCalculatorTest {

	@Test
	public void testGrade() {
		GradeCalculator gc = new GradeCalculator();
		char result = gc.grade(100);
		assertEquals('A', result);

		result = gc.grade(0);
		assertEquals('F', result);

	}

}
