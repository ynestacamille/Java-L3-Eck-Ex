
public class EE31SnackEyes {
  
   public static void main(String[] args) {
   
       int dice1, dice2;  
       
       int countRolls;  
       
       countRolls = 0;
       
       do {
          dice1 = (int)(Math.random()*6) + 1;   // roll the dice
          dice2 = (int)(Math.random()*6) + 1;
          countRolls++;                        // and count this roll
       } while ( dice1 != 1 || dice2 != 1 );
       
       System.out.println("Pour obtenir des yeux de serpent on a fait: " + countRolls + " rolls" );
   
   }  // end main()

}
