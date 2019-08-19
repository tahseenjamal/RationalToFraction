
public class RationalToFraction {
	
	
	public static void main(String[] args) {
	
		Rational number = new Rational(0.333333333);
		
		int numerator = number.getNumerator();
		
		int denominator = number.getDenominator();
		
		System.out.println(numerator + "/" + denominator);

	}

}
