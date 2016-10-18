package cards;
import org.junit.Test;

import cards.Card.Rank;
import cards.Card.Suit;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;



public class GameTests {

	@Test
	public void isSameColor(){
		Card card = new Card(Rank.FIVE, Suit.SPADES);
		assertThat(card.isRed() ,is(false));
	}
}
