package com.comp303.service.hand;

import java.util.ArrayList;
import java.util.Comparator;

import com.comp303.common.Card;

public class SortedHand { 
	
	private final int aNumCards;
	private final Comparator<Card> aCompareator;
	private ArrayList<Card> aHandCards;
	
	
	SortedHand(int pNumCards, Comparator<Card> pCompareator){
		aCompareator = pCompareator;
		aNumCards = pNumCards;
		aHandCards = new ArrayList<Card>(pNumCards);
	}
	
	public void add(Card pCard){
		assert pCard != null;
		assert !this.isFull();
		
		aHandCards.add(pCard);
		aHandCards.sort(aCompareator);
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




}