public class Command {

	public static void main(String[] args) {
	Fractions myFraction = new Fractions(6, 7);
	myFraction.GCD(myFraction);
	Fractions myFraction2 = new Fractions(8, 9);
	myFraction2.GCD(myFraction2);
	
	//running methods for fraction 1
	System.out.println(myFraction.getNumerator());
	System.out.println(myFraction.getDenominator());
	System.out.println(myFraction.getDouble());
	//running methods for fraction 2
	System.out.println(myFraction2.getNumerator());
	System.out.println(myFraction2.getDenominator());
	System.out.println(myFraction2.getDouble());
	Fractions.Multiply(myFraction, myFraction2);
	
	}//main

}//Command

