
public class EE34ListWords {
	public static void main(String[] args) {
		   
	       String textuser;    
	       int position;          
	       char characters;     
	       boolean checkchar; 
	       
	       System.out.println("Entrer text");
	       System.out.print("? ");
	       textuser = TextIO.getln();
	       
	       System.out.println();
	       checkchar = true;
	       
	       for ( position = 0;  position < textuser.length();  position++ ) {
	          characters = textuser.charAt(position);
	          if ( Character.isLetter(characters) ) {
	             System.out.print(characters);
	             checkchar = false;
	          }
	          else {
	             if ( checkchar == false ) {
	            	 
	                System.out.println();
	                checkchar = true;
	             }
	          }
	       }
	       
	       System.out.println(); 
	         
	   }  // end main()
}
