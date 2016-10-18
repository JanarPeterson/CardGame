package cards;


import java.util.*;

import cards.Card.Rank;
import cards.Card.Suit;

public class Card {
public static void main(String[] args) {
	Card card1 = new Card(Rank.EIGHT, Suit.DIAMONDS);
	Card card2 = new Card(Rank.SIX, Suit.DIAMONDS);
	System.out.println(card2.rankDif(card1));
	
}
	public int getCardValue() {
		return rank().value;
	}

	public enum Rank {

		DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
		
		private int value;
		private Rank(int constValue) {
			this.value = constValue;
		}

	}

	public enum Suit {
		CLUBS, DIAMONDS, HEARTS, SPADES
	}

	private final Rank rank;
	private final Suit suit;

	Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank rank() {
		return rank;
	}

	public Suit suit() {
		return suit;
	}

	public String toString() {
		return rank + " of " + suit + " (" + rank.value + ")";
	}

	private static final List<Card> protoDeck = new ArrayList<Card>();

	static int temp;

	// Initialize prototype deck
	static {
		for (Suit suit : Suit.values())

			for (Rank rank : Rank.values())
				protoDeck.add(new Card(rank, suit));

	}

	public static ArrayList<Card> newDeck() {
		return new ArrayList<Card>(protoDeck); // Return copy of prototype deck
	}

	public boolean isRed() {
		boolean color = false;
		if(this.suit().equals(Suit.HEARTS) || this.suit().equals(Suit.DIAMONDS)){
			color = true;
		}
		return color;
		
	}
	
	public boolean rankDif(Card card1){
		//added test comment and changed one test name
		if(this.getCardValue() - card1.getCardValue() <=3 && this.getCardValue() - card1.getCardValue() >=-3){
			return true; //change this to true
		}
		return true;
	}
}