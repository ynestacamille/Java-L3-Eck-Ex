package EE53;

import java.util.Scanner;

public class EE52SimpleStats {

	 public static void main(String[] args) {
		   
         Scanner in = new Scanner(System.in);
  
         EE52StatCalc calc; // Computes stats for numbers entered by user.
         calc = new EE52StatCalc();
  
         double item; // One number entered by the user.
  
         System.out.println("Enter your numbers.  Enter 0 to end.");
         System.out.println();
  
         do {
            System.out.print("? ");
            item = in.nextDouble();
            if (item != 0)
               calc.enter(item);
         } while (item != 0);
  
         System.out.println("\nStatistics about your calc:\n");
         System.out.println("   Count:              " + calc.getCount());
         System.out.println("   Sum:                " + calc.getSum());
         System.out.println("   Minimum:            " + calc.getMin());
         System.out.println("   Maximum:            " + calc.getMax());
         System.out.println("   Average:            " + calc.getMean());
         System.out.println("   Standard Deviation: "
                + calc.getStandardDeviation());
  
      } // end main()
}
