
public class EE32Divisor {

	   public static void main(String[] args) {
	   
	       int Value;            
	       int maxDivisors;  
	       int numWithMax;   
	       maxDivisors = 1;
	       numWithMax = 1;


	       for ( Value = 2;  Value <= 10000;  Value++ ) {
	           int D;  
	           int divisorCount; 
	           divisorCount = 0;
	           
	           for ( D = 1;  D <= Value;  D++ ) { 
	              if ( Value % D == 0 )
	                 divisorCount++;
	           }
	           if (divisorCount > maxDivisors) {
	              maxDivisors = divisorCount;
	              numWithMax = Value;
	           }
	       }
	       
	       System.out.println("Nombre maximum du diviseur :" + maxDivisors);
	       System.out.println("sont diviseur est " + numWithMax);
	   
	   } // end main()

		
}
