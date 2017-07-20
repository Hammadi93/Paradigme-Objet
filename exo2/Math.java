package exo2;

public class Math {
	
	public static void main(String[] args) {
		
		Rational rational1 = new Rational(18,30);
		Rational rational2 = new Rational(12,24);
		
		System.out.println("Resultat Somme : "+rational1.add(rational2));
		System.out.println("Resultat Multiplication :"+rational1.multiply(rational2));
		
	}

}
