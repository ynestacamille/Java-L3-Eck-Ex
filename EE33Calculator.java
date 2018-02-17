
public class EE33Calculator {
	
	public static void main(String[] args) {
		   
	      double firstNum;    
	      double secondNum;   
	      char operator;      
	      double value;       
	      
	      System.out.println("Enter calcul de la forme (a operateur b): ");

	      System.out.println();
	      
	      while (true) {
	    	  // read user input
	          firstNum = TextIO.getDouble();
	          if (firstNum == 0)
	             break;
	          operator = TextIO.getChar();
	          secondNum = TextIO.getlnDouble();

	          switch (operator) {
	              case '+':
	                 value = firstNum + secondNum;
	                 break;
	              case '-':
	                 value = firstNum - secondNum;
	                 break;
	              case '*':
	                 value = firstNum * secondNum;
	                 break;
	              case '/':
	                 value = firstNum / secondNum;
	                 break;
	               // if operator is unknown
	              default:
	                 System.out.println("operateur inconnu: " + operator);
	                 continue; 
	          }

	          System.out.println("Total : " + value);
	          System.out.println();           
	      } 
	      System.out.println("Au revoir");
	   } 

}
