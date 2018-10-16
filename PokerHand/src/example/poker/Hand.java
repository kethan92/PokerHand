package example.poker;

public class Hand {

	//private List<Card> card = new ArrayList<Card>();
	Card[] card = new Card[5];
	
	public Card[] getCard() {
		return card;
	}

	public void setCard(Card[] card) {
		this.card = card;
	}

	public Hand(String arrayCard)
	{
		for(int i=0; i<5; i++)
		{
			card[i] = new Card(String.valueOf((arrayCard.charAt(2*i))), 
					String.valueOf(arrayCard.charAt(2*i+1)));
		}
	}
	
	public static void sortByRank(Card[] h)
	{
      int i, j, min_j;
      for ( i = 0 ; i < h.length ; i ++ )
      {
         min_j = i;   // Assume elem i (h[i]) is the minimum

         for ( j = i+1 ; j < h.length ; j++ )
         {
            if (h[j].getRank() < h[min_j].getRank())
            {
               min_j = j;
            }
         }
         Card help = h[i];
         h[i] = h[min_j];
         h[min_j] = help;
      }
	}
	
	public boolean isFourCard(Card[] card)
	{
		boolean isFourCardHigher, isFourCardLower;
		if(card.length != 5)
			return false;
		sortByRank(card);
		isFourCardLower = card[0].getRank() == card[1].getRank() && card[1].getRank() == card[2].getRank()
				&& card[3].getRank() == card[2].getRank();
		isFourCardHigher = card[1].getRank() == card[2].getRank() && card[3].getRank() == card[2].getRank()
				&& card[3].getRank() == card[4].getRank();
		return (isFourCardLower || isFourCardHigher);
	}
	
	public boolean isFullHouse(Card[] card)
	{
		boolean a1,a2;
	    if(card.length != 5)
	    	return false;
	    sortByRank(card);
	    /* ------------------------------------------------------
        Check for: x x x y y
	 	------------------------------------------------------- */  
		 a1 = card[0].getRank() == card[1].getRank() &&
			  card[1].getRank() == card[2].getRank() &&
		      card[3].getRank() == card[4].getRank();
		
		 /* ------------------------------------------------------
		    Check for: x x y y y
		 ------------------------------------------------------- */
		 a2 = card[0].getRank() == card[1].getRank() &&
			  card[2].getRank() == card[3].getRank() &&
			  card[3].getRank() == card[4].getRank();
		 return (a1 || a2);	      
	}
	
	public boolean isThreeCard(Card[] card)
	{
		boolean a1, a2, a3;
		if(card.length != 5)
	    	return false;
	    sortByRank(card);
	    if (isFourCard(card) || isFullHouse(card))
	         return false; 
	    /* ------------------------------------------------------
	        Check for: x x x a b
		 ------------------------------------------------------- */    
	     a1 = card[0].getRank() == card[1].getRank() &&
	    	  card[1].getRank() == card[2].getRank();

	     /* ------------------------------------------------------
	         Check for: a x x x b
		 ------------------------------------------------------- */   
	      a2 = card[1].getRank() == card[2].getRank() &&
	    	   card[2].getRank() == card[3].getRank();
	      
	      /* ------------------------------------------------------
	         Check for: a b x x x
		 ------------------------------------------------------- */   
	      a3 = card[2].getRank() == card[3].getRank() &&
	    	   card[3].getRank() == card[4].getRank();

	      return( a1 || a2 || a3 );
	}
	
	public boolean isTwoPairs(Card[] card)
	{
		boolean a1, a2, a3;

	      if (card.length != 5)
	         return false;

	     if (isFourCard(card) || isFullHouse(card) || isThreeCard(card))
	         return false;   

	      sortByRank(card);

	      /* --------------------------------
	         Checking: a a  b b x
		 -------------------------------- */                       
	      a1 = card[0].getRank() == card[1].getRank() &&
	    	   card[2].getRank() == card[3].getRank() ;

	      /* ------------------------------
	         Checking: a a x  b b
		 ------------------------------ */
	      a2 = card[0].getRank() == card[1].getRank() &&
	    	   card[3].getRank() == card[4].getRank() ;

	      /* ------------------------------
	         Checking: x a a  b b
		 ------------------------------ */
	      a3 = card[1].getRank() == card[2].getRank() &&
	    	   card[3].getRank() == card[4].getRank() ;

	      return( a1 || a2 || a3 );
	}
	
	public boolean isOnePairs(Card[] card)
	{
		boolean a1, a2, a3, a4;

	      if ( card.length != 5 )
	         return false;

	      if (isFourCard(card) || isFullHouse(card) || isThreeCard(card) || isTwoPairs(card))
	         return false;          

	      sortByRank(card);

	      /* --------------------------------
	         Checking: a a x y z
		 -------------------------------- */                            
	      a1 = card[0].getRank() == card[1].getRank() ;

	      /* --------------------------------
	         Checking: x a a y z
		 -------------------------------- */
	      a2 = card[1].getRank() == card[2].getRank() ;

	      /* --------------------------------
	         Checking: x y a a z
		 -------------------------------- */
	      a3 = card[2].getRank() == card[3].getRank() ;

	      /* --------------------------------
	         Checking: x y z a a
		 -------------------------------- */
	      a4 = card[3].getRank() == card[4].getRank() ;

	      return( a1 || a2 || a3 || a4 );
	}
	
	public String valueHand(Card[] card)
	{
		  if (isFourCard(card))
	         return "4C";
	      else if (isFullHouse(card))
	         return "FH";
	      else if (isThreeCard(card))
	         return "3C";
	      else if (isTwoPairs(card))
	         return "2P";
	      else if (isOnePairs(card))
	         return "1P";
	      else
	         return "--";
	}
}
