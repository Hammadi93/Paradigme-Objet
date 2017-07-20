package jUnit_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exo3.Natural;
import exo3.Numeric;
import exo3.Rational;
import exo3.Real;
import junit.framework.TestCase;

public class DivideTest extends TestCase {

	Rational number1;
	Real number2;
	Natural number3;

	@Override
	@Before
	public void setUp() throws Exception {
		this.number1 = new Rational(18, 30);
		this.number2 = new Real(0.2);
		this.number3 = new Natural(2);
	}

	@Override
	@After
	public void tearDown() throws Exception {
		this.number1 = null;
		this.number2 = null;
		this.number3 = null;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testerDivideRationalToReal() {
		try {
			Numeric resCalcul = this.number1.divide(this.number2);
			System.out.println("res ree rat: " + resCalcul);
			assertEquals(resCalcul, new Real(0.33333333333333337));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testerDivideNaturalToReal() {
		try {
			Numeric resCalcul = this.number2.divide(this.number3);
			System.out.println("res nat reel : " + resCalcul);
			assertEquals(resCalcul, new Real(0.1));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testerDivideNaturalToRational() {
		try {
			Numeric resCalcul = this.number1.divide(this.number3);
			System.out.println("res : " + resCalcul);
			assertEquals(resCalcul, new Rational(60, 18));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
