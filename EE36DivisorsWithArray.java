
public class EE36DivisorsWithArray {
	   public static void main(String[] args) {
		   
	       int N;          
	       int maxDivisors; 
	       
	       int[] saveCount; 
	       
	       saveCount = new int[10001];
	       
	       maxDivisors = 1; 
	       saveCount[1] = 1;

	       for ( N = 2;  N <= 10000;  N++ ) {
	       
	           int D; 
	           int divisorCount;  
	           divisorCount = 0;
	           
	           for ( D = 1;  D <= N;  D++ ) { 
	              if ( N % D == 0 )
	                 divisorCount++;
	           }
	           
	           saveCount[N] = divisorCount; 
	           
	           if (divisorCount > maxDivisors) {
	              maxDivisors = divisorCount;
	           }
	       
	       }
	       
	       System.out.println("The maximum number of divisors was " + maxDivisors);
	       System.out.println("Numbers with that many divisors include:");
	       for ( N = 1; N <= 10000; N++ ) {
	           if ( saveCount[N] == maxDivisors ) {
	               System.out.println( "   " + N );
	           }
	       }
	   
	   } // end main()
}
