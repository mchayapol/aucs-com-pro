package edu.au.scitech.sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class TowerOfHanoiSolverTest {

	@Test
	public void test() {
		TowerOfHanoiSolver game = new TowerOfHanoiSolver();
		int[] values = {10, 100, 1000, 1};
		game.addValues(values);		
		game.run();
	}

}
