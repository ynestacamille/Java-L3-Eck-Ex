package EE53;

public class EE51PairOfDice {
	
	private int die1;
	private int die2;

	 
	/**
	 * 
	 * @return
	 */
	public int getDie1() {
		return die1;
	}

	/**
	 * 
	 * @return
	 */
	public int getDie2() {
		return die2;
	}

	/**
	 * 
	 */
	public EE51PairOfDice (){
		roll();
	}
	
	/**
	 * 
	 */
    public void roll() {
        die1 = (int)(Math.random()* ( 10 - 1 ));
        die2 = (int)(Math.random()* ( 10 - 1 )) ;
    }
    
    /**
     * 
     * @return
     */
    public int getTotal() {
    	return die1 + die2;
    }

    /**
     * 
     */
    public String toString() {
        return "Die1 : " + die1 + ", Die2 : " + die2 + ", Total = " + getTotal();
    }
    

}
