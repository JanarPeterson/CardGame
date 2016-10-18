package cards;
import org.junit.Test;

import cards.Card.Rank;
import cards.Card.Suit;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class GameTests {

	Card randomCard = new Card(Rank.THREE, Suit.CLUBS);
	Game game = new Game();
	@Test
	public void isRedCard(){
		Card card = new Card(Rank.FIVE, Suit.SPADES);
		assertThat(card.isRed() ,is(false));
	}
	
	@Test
	public void rankDiffIsLessThanThree(){
		Card card = new Card(Rank.THREE, Suit.DIAMONDS);
		assertThat(card.rankDif(randomCard) ,is(true));
	}
	@Test
	public void isSameSuit(){
		Card card = new Card(Rank.THREE, Suit.DIAMONDS);
		assertThat(card.suitDif(randomCard) ,is(false));
	}
	@Test
	public void isSameRank(){
		Card card = new Card(Rank.THREE, Suit.DIAMONDS);
		assertThat(card.sameRank(randomCard) ,is(true));
	}
	@Test
	public void isSameCard(){
		Card card = new Card(Rank.THREE, Suit.DIAMONDS);
		Card card1 = new Card(Rank.THREE, Suit.CLUBS);
		assertThat(card.sameCard(randomCard) ,is(false));
		assertThat(card1.sameCard(randomCard) ,is(true));
		
	}
	
	@Test
	public void averageGameResult(){
		Card card1 = new Card(Rank.SIX, Suit.DIAMONDS);
		Card card2 = new Card(Rank.THREE, Suit.HEARTS);
		assertThat(game.playCards(card1, card2), is(6));
	}
	
	@Test
	public void bestGameResult(){
		Card card1 = new Card(Rank.SIX, Suit.DIAMONDS);
		Card card2 = new Card(Rank.SIX, Suit.DIAMONDS);
		assertThat(game.playCards(card1, card2), is(34));
	}
}
