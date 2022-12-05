package com.comp303.service.hand;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import com.comp303.common.*;

public class TestHand {
	public static Card AceSpades = new Card(Rank.ACE,Suit.SPADES);
	public static Card AceClubs = new Card(Rank.ACE,Suit.CLUBS);
	public static Card QueenHearts = new Card(Rank.QUEEN, Suit.HEARTS);
	public static Card KingSpades = new Card(Rank.KING, Suit.SPADES);
	public static Hand h1 = new Hand(3);
	public static Hand h2 = new Hand(2);
	public static ArrayList<Hand> handList = new ArrayList<Hand>();
	
	static {
		h1.add(AceSpades);
		h1.add(QueenHearts);
		//h1.add(KingSpades);
		h1.add(AceClubs);
		
		h2.add(KingSpades);
		h2.add(QueenHearts); 
		
		handList.add(h1);
		handList.add(h2);
	}
	
	@Test
	public void TestCompareTo() {
		assertEquals(h1.compareTo(h2), 1);
	}
	
	@Test
	public void TestComparator() {
		handList.sort( Hand.createRankCompator(Rank.KING));
		assertEquals(handList.get(handList.size()-1), h2);
	}

}
