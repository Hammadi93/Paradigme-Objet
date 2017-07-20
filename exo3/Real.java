package exo3;

public class Real extends Numeric {

	private final double value;

	public Real(double value) {
		this.value = value;
	}

	public Real() {
		this.value = 0;
	}

	public double getValue() {
		return this.value;
	}

	@Override
	public Numeric add(Numeric numeric) {
		return numeric.addReal(this);
	}

	@Override
	public Numeric multiply(Numeric numeric) {
		return numeric.multiplyReal(this);
	}

	@Override
	public Numeric substract(Numeric numeric) {
		return numeric.opposite().add(this);
	}

	@Override
	public Numeric divide(Numeric numeric) {
		return numeric.inverse().multiply(this);

	}

	@Override
	protected Numeric addRational(Rational rational) {
		return new Real(this.value + (double) rational.getNumerator() / (double) rational.getDenominator());
	}

	@Override
	protected Numeric multiplyRational(Rational rational) {
		return new Real(this.value * ((double) rational.getNumerator() / (double) rational.getDenominator()));
	}

	@Override
	public String toString() {
		return Double.toString(this.value);
	}

	@Override
	public Real opposite() {
		return new Real(this.value * -1);
	}

	@Override
	protected Numeric inverse() {
		return new Real(1 / this.value);
	}

	@Override
	protected Numeric addReal(Real real) {
		return new Real(this.value + real.getValue());
	}

	@Override
	protected Numeric multiplyReal(Real real) {
		return new Real(this.value * real.getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(this.value);
		result = prime * result + (int) (temp ^ temp >>> 32);
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
		Real other = (Real) obj;
		if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		return true;
	}
}
