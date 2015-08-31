package sc2101;

import static org.junit.Assert.*;

import org.junit.Test;

public class VatCalculatorTest {

	@Test
	public void testVat1() {
		VatCalculator vc = new VatCalculator();
		double v = vc.vat( 107 );
		
		assertEquals( 7, v, 0);	// expected, actual, delta		
	}

	@Test
	public void testVat2() {
		VatCalculator vc = new VatCalculator();
		double v = vc.vat( 30000 );
		
		assertEquals( 1962.62 , v, 0.01 );	// expected, actual, delta		
	}
	
	@Test
	public void testVatZero() {
		VatCalculator vc = new VatCalculator();
		double v = vc.vat( 0 );
		assertEquals( 0 , v, 0 );	// expected, actual, delta		
	}

}
