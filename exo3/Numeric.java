package exo3;

public abstract class Numeric {

	public abstract Numeric add(Numeric numeric);

	public abstract Numeric multiply(Numeric numeric);

	public abstract Numeric substract(Numeric numeric);

	public abstract Numeric divide(Numeric numeric);

	protected abstract Numeric addRational(Rational rational);

	protected abstract Numeric multiplyRational(Rational rational);

	protected abstract Numeric opposite();

	protected abstract Numeric inverse();

	protected abstract Numeric addReal(Real real);

	protected abstract Numeric multiplyReal(Real real);

}
