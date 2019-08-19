
public class Rational {
	
	private int numerator;
	
	private int denominator;
	
	public int getNumerator() {
		
		return numerator;
	}

	public int getDenominator() {
		
		return denominator;
	}

	public Rational(double decimalNum){
		
	    double tolerance = 1.0E-6;
	    
	    double h1 = 1, h2=0;
	    
	    double k1 = 0, k2=1;
	    
	    double b = decimalNum;
	    
	    do {
	        
	    	double a = Math.floor(b);
	        
	        double aux = h1; 
	        
	        h1 = a * h1 + h2; 
	        
	        h2 = aux;
	        
	        aux = k1; k1 = a*k1+k2; k2 = aux;
	    
	        b = 1/(b-a);
	    
	    } while (Math.abs(decimalNum-h1/k1) > decimalNum*tolerance);

	    this.numerator = (int)h1;
	    
	    this.denominator = (int)k1;
	    
	    
	}

	
}
