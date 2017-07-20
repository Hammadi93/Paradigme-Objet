package exo2;

public class Rational {

	private final int numerator;
	private final int denominator;

	public Rational(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator doit être different de 0");
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Rational add(Rational rational) {
		return new Rational(this.numerator * rational.denominator + rational.numerator * this.denominator,
				this.denominator * rational.denominator).reduce();
	}

	public Rational multiply(Rational rational) {
		return new Rational(this.numerator * rational.numerator, this.denominator * rational.denominator);
	}

	public int pgcd() {
		int num = this.numerator;
		int denom = this.denominator;
		int pgcd, tmp, mod;
		if (num == 0) {
			return denom;
		}
		if (denom == 0) {
			return num;
		}
		if (num < denom) {
			tmp = num;
			num = denom;
			denom = tmp;
		}
		while (denom != 0) {
			mod = num % denom;
			num = denom;
			denom = mod;
		}
		pgcd = num;
		return pgcd;
	}

	public Rational reduce() {
		int pgcd = this.pgcd();
		return new Rational(this.numerator / pgcd, this.denominator / pgcd);
	}

	public int opposite() {
		return this.numerator * -1;
	}

	public Rational substract(Rational rational) {
		int op = rational.opposite();
		return this.add(new Rational(op, rational.denominator));
	}

	public Rational inverse() {
		if (this.numerator == 0) {
			new IllegalArgumentException("Division par 0 impossible pour l'inverse denominateur/numarateur");
		}
		return new Rational(this.denominator, this.numerator);
	}

	public Rational divide(Rational rational) {
		rational.inverse();
		return this.multiply(rational);
	}

	@Override
	public String toString() {
		return "Rational [numerator=" + this.numerator + ", denominator=" + this.denominator + "]";
	}
}
