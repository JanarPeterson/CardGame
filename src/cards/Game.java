package cards;

import cards.Card.Rank;
import cards.Card.Suit;

public class Game {
	public static void main(String[] args) {
		Card choiceCard = new Card(Rank.THREE, Suit.DIAMONDS
				);
		System.out.println("Finale score is: "+playCards(choiceCard));
		
		
	}
	
	public static int playCards(Card playerCard){
		int score = 0;
		Card randomCard = new Card(Rank.THREE, Suit.CLUBS);
		
		if((playerCard.isRed() && randomCard.isRed()) || (!playerCard.isRed() && !randomCard.isRed())){
			score += 2;
			System.out.println("A - " + score);
		}
		
		if(randomCard.suitDif(playerCard)){
			 score += 3;
			 System.out.println("B - " + score);
		}
		if(randomCard.sameRank(playerCard)){
			 score += 15;
			 System.out.println("C - " + score);
		}
		if(randomCard.sameCard(playerCard)){
			score += 25;
			System.out.println("D - " + score);
		}
		if(randomCard.rankDif(playerCard) ){
			 score += 4;
			 System.out.println("E - "+ score);
		}
		
		return score;
	}
}
