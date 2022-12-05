package com.comp303.service.hand;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.comp303.common.*;

public class Hand implements Iterable<Card>, Comparable<Hand>{ 
	
	private final int aNumCards;
	private ArrayList<Card> aHandCards;
	
	Hand(int pNumCards){
		aNumCards = pNumCards;
		aHandCards = new ArrayList<Card>(pNumCards);
	}
	
	public void add(Card pCard){
		assert pCard != null;
		assert !this.isFull();
		
		aHandCards.add(pCard);
	}
	
	public Card remove() {
		assert ! this.isEmpty();
		
		return aHandCards.remove(aHandCards.size()-1);
	}
	
	public Boolean contains(Card pCard) {
		assert pCard != null;
		return aHandCards.contains(pCard);
	}
	
	public Boolean isEmpty() {
		return aHandCards.isEmpty();
	}
	
	public int size() {
		return aHandCards.size();
	}
	
	public Boolean isFull() {
		return ! (aHandCards.size() < aNumCards);
	}
	
	@Override
	public Iterator<Card> iterator() {
		
		return new Iterator<Card>() {
			private int cur = 0; 
			
			@Override
			public boolean hasNext() {
				return cur < aHandCards.size();
			}

			@Override
			public Card next() {
				return aHandCards.get(cur++);
				
			}
			
		};
	}
	

	@Override
	public int compareTo(Hand pHand) {
		return this.size() - pHand.size(); 
	}

	public static Comparator<Hand> createRankCompator (Rank pRank){
		return new Comparator<Hand>() {
			
			private int countHelper(Hand pHand) {
				int count = 0;
				for (Card c: pHand) {
					if (c.getRank() == pRank) {
						count++;
					}
				}
				return count;
			}

			@Override
			public int compare(Hand arg0, Hand arg1) {
				return countHelper(arg0) - countHelper(arg1);
			}
			
		};
		
	}


	
}
