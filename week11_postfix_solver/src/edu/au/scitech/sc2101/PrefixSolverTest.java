package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrefixSolverTest {

	@Test
	public void test() {
		String question1 = "-+723";
		String question2 = "+-+5341";
		String question3 = "-++7215";
		String question3err = "721++5-";
		
		PrefixSolver solver = new PrefixSolver();
		
		assertEquals(6,solver.solve(question1));
		assertEquals(5,solver.solve(question2));
		assertEquals(5,solver.solve(question3));
		
		try{
			solver.solve(question3err);
			fail("Except IllegalArgument Exception");
		} catch(IllegalArgumentException e) {
			// pass, except the exception for invalid input
		}
	}

}
