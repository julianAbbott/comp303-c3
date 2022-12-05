package com.comp303.service.hand;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import com.comp303.common.*;

public class TestHand {
	
	@Test
	public void TestCompareTo() {
		Card AceSpades = new Card(Rank.ACE,Suit.SPADES);
		Card QueenHearts = new Card(Rank.QUEEN, Suit.HEARTS);
		Card KingSpades = new Card(Rank.KING, Suit.SPADES);
		Hand h1 = new Hand(3);
		Hand h2 = new Hand(2);
		
		h1.add(AceSpades);
		h1.add(QueenHearts);
		h1.add(KingSpades);
		
		h2.add(KingSpades);
		h2.add(QueenHearts); 
		
		assertEquals(h1.compareTo(h2), 1);
		
	}

}
