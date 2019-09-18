public class Fractions {
    private int p;
    private int q;

	public Fractions(int myP, int myQ) {
		this.p = myP;
		if(myQ == 0) {
		this.q = 1;
		} else {this.q = myQ;}
		GCD();
	}//Fractions constructor

	public double getDouble() {
		double total = this.p * 1.0/this.q;
		return total;
	}//getDouble

	public int getP() {
		return this.p;
	}//getp

	public int getQ() {
		return this.q;
	}//getq
	
	//multiplies two fractions
	public static String Multiply(Fractions myFraction, Fractions myFraction2) {
		String output = "";
		
		myFraction.p *= myFraction2.p;
		myFraction.q *= myFraction2.q;
		output = myFraction.p + "/" + myFraction.q;		
		return output;	
		
	}//Multiply
	
	public static String add(Fractions myFraction, Fractions myFraction2) {
		
		String output = "";
		myFraction.p *= myFraction2.q;
		myFraction2.p *= myFraction.q;
		myFraction.q *= myFraction2.q;
		Fractions aFrac = new Fractions((myFraction.p + myFraction2.p), myFraction.q);
		output = aFrac.p + "/" + aFrac.q;
		return output;
		
	}//add
	

	//reduces fractions to lowest terms
	private void GCD() {
		int gcd = 1;
		for(int i = 1; i <= this.p && i <= this.q; i++) {
			if(this.p % i == 0 && this.q % i == 0) {
					gcd = i;	
			}//if
		}//for
		this.p /= gcd;
		this.q /= gcd;
	}//GCD
	
	
	//returns fraction as a string
	public String toString() {
		String fraction = this.p + "/" + this.q;
		return fraction;
	}
	
	
		
}//Fractions
