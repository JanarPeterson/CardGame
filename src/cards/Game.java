package cards;

import cards.Card.Rank;
import cards.Card.Suit;

public class Game {
	public static void main(String[] args) {
		Game newGame = new Game();
		Card choiceCard = new Card(Rank.THREE, Suit.DIAMONDS);
		Card randomCard = Card.generateRandomCard();
		System.out.println("Finale score is: " + newGame.playCards(choiceCard, randomCard));

	}
	
	public int playCards(Card playerCard, Card computerCard){
		int score = 0;
		System.out.println(computerCard);
		
		if((playerCard.isRed() && computerCard.isRed()) || (!playerCard.isRed() && !computerCard.isRed())){
			score += 2;
			System.out.println("A - " + score);
		}
		
		if(computerCard.suitDif(playerCard)){
			 score += 3;
			 System.out.println("B - " + score);
		}
		if(computerCard.sameRank(playerCard)){
			 score += 15;
			 System.out.println("C - " + score);
		}
		if(computerCard.sameCard(playerCard)){
			score += 25;
			System.out.println("D - " + score);
		}
		if(computerCard.rankDif(playerCard) ){
			 score += 4;
			 System.out.println("E - "+ score);
		}
		
		return score;
	}
}
