public class Fractions {
    private int p;
    private int q;
    
    Fractions(){
    	p = 0;
    	q = 1;
    }

	public Fractions(int myP, int myQ) {
		this.p = myP;
		if(myQ == 0) {
		this.q = 1;
		} else if(myQ < 0){
			this.p *= -1;
			this.q *= -1;
		}else {this.q = myQ;}
		GCD();
	}//Fractions constructor

	public double getDouble() {
		double total = this.p * 1.0/this.q;
		return total;
	}//getDouble

	public int getP() {
		return this.p;
	}//getP

	public int getQ() {
		return this.q;
	}//getQ
	
	//multiplies two fractions
	public static Fractions Multiply(Fractions myFraction, Fractions myFraction2) {
		
		int newP = myFraction.p * myFraction2.p;
		int newQ = myFraction.q * myFraction2.q;
		Fractions frac = new Fractions(newP, newQ);	
		return frac;	
		
	}//Multiply
	
	//add Fractions
	public static Fractions add(Fractions myFraction, Fractions myFraction2) {
		
		int newP = myFraction.p * myFraction2.q + myFraction2.p * myFraction.q;
		int newQ = myFraction.q * myFraction2.q;
		Fractions aFrac = new Fractions(newP, newQ);
		return aFrac;
		
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
