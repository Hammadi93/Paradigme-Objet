package jUnit_1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exo3.Natural;
import exo3.Numeric;
import exo3.Rational;
import exo3.Real;
import junit.framework.TestCase;

public class MultiplyTest extends TestCase {

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
	public void testerMultiplyRationalToReal() {
		try {
			Numeric resCalcul = this.number1.multiply(this.number2);
			System.out.println("res : " + resCalcul);
			assertEquals(resCalcul, new Real(0.12));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testerMultiplyNaturalToReal() {
		try {
			Numeric resCalcul = this.number3.multiply(this.number2);
			System.out.println("res : " + resCalcul);
			assertEquals(resCalcul, new Real(0.4));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testerMultiplyNaturalToRational() {
		try {
			Numeric resCalcul = this.number1.multiply(this.number3);
			System.out.println("res : " + resCalcul);
			assertEquals(resCalcul, new Rational(36, 30));
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
