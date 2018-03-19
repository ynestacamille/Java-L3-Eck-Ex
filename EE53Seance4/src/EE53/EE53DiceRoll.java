package EE53;

public class EE53DiceRoll {

	   static final int NUMBER_OF_EXPERIMENTS = 10000;
	   
	   private static EE51PairOfDice dice = new EE51PairOfDice();

	   
	   public static void main(String[] args) {
	   
	       for ( int total = 2;  total <= 12;  total++ ) {
	          EE52StatCalc stats;
	          stats = new EE52StatCalc();
	          for ( int i = 0; i < NUMBER_OF_EXPERIMENTS; i++ ) {
	 
	             stats.enter( rollFor(total) );
	          }
	          System.out.printf("%6d", total);
	          System.out.printf("%18.3f", stats.getMean());
	          System.out.printf("%19.3f", stats.getStandardDeviation());
	          System.out.printf("%14.3f", stats.getMax());
	          System.out.println();
	       }
	       
	   } // end main

	   static int rollFor( int N ) {
	       int rollCt = 0; 
	       do {
	          dice.roll();
	          rollCt++;
	       } while ( dice.getTotal() != N );
	       return rollCt;
	   }


}
