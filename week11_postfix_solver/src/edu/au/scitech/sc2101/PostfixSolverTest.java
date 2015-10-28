package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixSolverTest {

	@Test
	public void test() {
		String question1 = "72+3-";
		String question2 = "53+4-1+";
		String question3 = "72+1+5-";
		String question3err = "721++5-";
		
		PostfixSolver solver = new PostfixSolver();
		
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
