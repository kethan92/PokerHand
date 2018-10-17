package example.poker;

public class Card {

	private static final String TWO = "2";
	private static final String THREE = "3";
	private static final String FOUR = "4";
	private static final String FIVE = "5";
	private static final String SIX = "6";
	private static final String SEVEN = "7";
	private static final String EIGHT = "8";
	private static final String NINE = "9";
	private static final String TEN = "10";
	private static final String J = "J";
	private static final String Q = "Q";
	private static final String K = "K";
	private static final String A = "A";
	
	private Integer rank;
	
	private String suit;

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public Card(String suit, String rank)
	{
		Integer rankAfterConvertFromString;
		switch(rank) {
			case TWO: rankAfterConvertFromString = 2;
			 break;
			case THREE: rankAfterConvertFromString = 3;
			 break;
			case FOUR: rankAfterConvertFromString = 4;
			 break;
			case FIVE: rankAfterConvertFromString = 5;
			 break;
			case SIX: rankAfterConvertFromString = 6;
			 break;
			case SEVEN: rankAfterConvertFromString = 7;
			 break;
			case EIGHT: rankAfterConvertFromString = 8;
			 break;
			case NINE: rankAfterConvertFromString = 9;
			 break;
			case TEN: rankAfterConvertFromString = 10;
			 break;
			case J: rankAfterConvertFromString = 11;
			 break;
			case Q: rankAfterConvertFromString = 12;
			 break;
			case K: rankAfterConvertFromString = 13;
			 break;
			case A: rankAfterConvertFromString = 14;
			 break;
			default: rankAfterConvertFromString = 0;
				 break;
		}
		this.rank = rankAfterConvertFromString;
		this.suit = suit;
	}
}
