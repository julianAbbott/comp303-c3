package com.comp303.service.hand;
import java.util.ArrayList;
import java.util.List;

import com.comp303.common.*;

public class Hand { 
	
	private final int aNumCards;
	private ArrayList<Card> aHandCards;
	
	Hand(int pNumCards){
		aNumCards = pNumCards;
		aHandCards = new ArrayList<Card>(pNumCards);
	}
	
	public void add(Card pCard){
		assert pCard != null;
		assert ! this.isFull();
		
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
		return aHandCards.size() < aNumCards;
	}
}
