package example.poker;

public class Card {

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
			case "2": rankAfterConvertFromString = 2;
			 break;
			case "3": rankAfterConvertFromString = 3;
			 break;
			case "4": rankAfterConvertFromString = 4;
			 break;
			case "5": rankAfterConvertFromString = 5;
			 break;
			case "6": rankAfterConvertFromString = 6;
			 break;
			case "7": rankAfterConvertFromString = 7;
			 break;
			case "8": rankAfterConvertFromString = 8;
			 break;
			case "9": rankAfterConvertFromString = 9;
			 break;
			case "10": rankAfterConvertFromString = 10;
			 break;
			case "J": rankAfterConvertFromString = 11;
			 break;
			case "Q": rankAfterConvertFromString = 12;
			 break;
			case "K": rankAfterConvertFromString = 13;
			 break;
			case "A": rankAfterConvertFromString = 14;
			 break;
			default: rankAfterConvertFromString = 0;
				 break;
		}
		this.rank = rankAfterConvertFromString;
		this.suit = suit;
	}
}
