package collections.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import collections.PlayingCards;

public class playingCardTest {

	@Test
	public void testCardEquals() {
		PlayingCards pc1 = new PlayingCards('S', 'A');
		PlayingCards pc2 = new PlayingCards('D', 'A');
		
		assertEquals(pc1.equals(pc2), true);
	}
}
