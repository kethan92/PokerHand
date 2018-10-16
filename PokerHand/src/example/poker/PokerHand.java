package example.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerHand {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your poker hand:");
		Scanner scanner = new Scanner(System.in);
		String pokerHand = scanner.nextLine();
		
		//PokerHand.Hand hand = new PokerHand.Hand(deck);
		Hand hand = new Hand(pokerHand);
		Card[] card = hand.getCard();
		String outputPokerHand = hand.valueHand(card);
		System.out.println("Output for poker hand:");
		System.out.println(outputPokerHand);
	}

}
