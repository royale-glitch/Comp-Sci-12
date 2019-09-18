public class Main {

	public static void main(String[] args) {
		System.out.println("Prog_Ex 5???");
	Fractions myFraction = new Fractions(14, 70);
	Fractions myFraction2 = new Fractions(12, 3);

	
	//running methods for fraction 1
	System.out.println(myFraction.toString());
	System.out.println(myFraction2.toString());
	System.out.println(myFraction.getP());
	System.out.println(myFraction.getQ());
	System.out.println(myFraction.getDouble());
	//running methods for fraction 2
	System.out.println(myFraction2.getP());
	System.out.println(myFraction2.getQ());
	System.out.println(myFraction2.getDouble());
	System.out.println(Fractions.Multiply(myFraction, myFraction2));
	System.out.println(Fractions.add(myFraction, myFraction2));
	
	}//main

}//Command
