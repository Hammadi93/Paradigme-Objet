package exo1;

public class Math {
	
	public static void main(String[] args) {
		
		Natural four = new Natural(0);
		
		System.out.println(new Natural(3).getValue()+" + "+four.getValue()+" = "+new Natural(3).add(four).getValue());
		System.out.println(new Natural(3).getValue()+" * "+four.getValue()+" = "+new Natural(3).multiply(four).getValue());
		System.out.println(new Natural(3).getValue()+" - "+four.getValue()+" = "+new Natural(3).substract(four).getValue());
		System.out.println(new Natural(3).getValue()+" / "+four.getValue()+" = "+new Natural(3).divide(four).getValue());
		
	}

}
