public class Fractions {
private int numerator, denominator;

	public Fractions(int myNumerator, int myDenominator) {
		this.numerator = myNumerator;
		this.denominator = myDenominator;
	}//Fractions constructor

	public double getDouble() {
		double total = this.numerator * 1.0/this.denominator;
		return total;
	}//getDouble

	public int getNumerator() {
		return this.numerator;
	}//getNumerator

	public int getDenominator() {
		return this.denominator;
	}//getDenominator
	
	//not printing
	public static String Multiply(Fractions myFraction, Fractions myFraction2) {
		String output = "";
		myFraction.numerator *= myFraction2.numerator;
		myFraction.denominator*= myFraction2.denominator;
		output = myFraction.numerator + "/" + myFraction.denominator;
		return output;	
		
	}//Multiply
	
	//reduces fractions to lowest terms
	public void GCD(Fractions myFraction) {
		
		for(int i = 1; i <= myFraction.numerator && i <= myFraction.denominator ; i++) {
			if(myFraction.numerator % i == 0 && myFraction.denominator % i == 0) {
				myFraction.numerator /= i;
				myFraction.denominator /= i;
			}//if
		}//for
	}//GCD	
	
}//Fractions