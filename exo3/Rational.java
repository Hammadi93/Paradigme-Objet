package exo3;

public class Rational extends Numeric {

	private final int numerator;
	private final int denominator;

	public Rational(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator doit être different de 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	@Override
	public Numeric addRational(Rational rational) {
		return new Rational(this.numerator * rational.denominator + rational.numerator * this.denominator,
				this.denominator * rational.denominator).reduce();
	}

	@Override
	public Numeric multiplyRational(Rational rational) {
		return new Rational(this.numerator * rational.numerator, this.denominator * rational.denominator);
	}

	public int calculerPpgcd(int a, int b) {
		if (b == 0) {
			return a;
		} else if (b > a) {
			return this.calculerPpgcd(b, a);
		} else {
			return this.calculerPpgcd(b, a % b);
		}
	}

	public Numeric reduce() {
		int pgdc = this.calculerPpgcd(java.lang.Math.abs(this.numerator), java.lang.Math.abs(this.denominator));
		return new Rational(this.numerator / pgdc, this.denominator / pgdc);
	}

	@Override
	public Numeric opposite() {
		return new Rational(this.numerator * -1, this.denominator);
	}

	@Override
	public Numeric inverse() {
		if (this.numerator == 0) {
			new IllegalArgumentException("Division par 0 impossible pour l'inverse denominateur/numarateur");
		}
		return new Rational(this.denominator, this.numerator);
	}

	public Numeric divideRational(Rational rational) {
		rational.inverse();
		return this.multiplyRational(rational);
	}

	public Numeric substractRational(Rational rational) {
		// return this.add(new Rational(rational.opposite(),
		// rational.denominator));
		return null;
	}

	@Override
	public String toString() {
		return "Rational [numerator=" + this.numerator + ", denominator=" + this.denominator + "]";
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addRational(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplyRational(this);
	}

	@Override
	public Numeric substract(Numeric numeric) {
		return numeric.opposite().addRational(this);
	}

	@Override
	public Numeric divide(Numeric numeric) {
		return numeric.multiplyRational((Rational) this.inverse());
	}

	@Override
	protected Numeric addReal(Real real) {
		return real.addRational(this);
	}

	@Override
	protected Numeric multiplyReal(Real real) {
		return real.multiply(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.denominator;
		result = prime * result + this.numerator;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Rational other = (Rational) obj;
		if (this.denominator != other.denominator) {
			return false;
		}
		if (this.numerator != other.numerator) {
			return false;
		}
		return true;
	}
}