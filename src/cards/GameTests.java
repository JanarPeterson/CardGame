package cards;
import org.junit.Test;

import cards.Card.Rank;
import cards.Card.Suit;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class GameTests {

	Card random = new Card(Rank.SIX, Suit.SPADES);
	@Test
	public void isSameColor(){
		Card card = new Card(Rank.FIVE, Suit.SPADES);
		assertThat(card.isRed() ,is(false));
	}
	
	@Test
	public void rankDiffIsLessThanThree(){
		Card card = new Card(Rank.EIGHT, Suit.DIAMONDS);
		assertThat(card.rankDif(random) ,is(true));
	}
}
