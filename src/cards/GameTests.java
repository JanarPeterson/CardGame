package cards;
import org.junit.Test;

import cards.Card.Rank;
import cards.Card.Suit;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class GameTests {

	Card randomCard = new Card(Rank.SIX, Suit.SPADES);
	@Test
	public void isSameColor(){
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
		assertThat(card.sameRank(randomCard) ,is(false));
	}
	
}
