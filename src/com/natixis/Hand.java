package com.natixis;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {

	ArrayList<Card> cards = new ArrayList<>();
	
	public Hand(String cards) {
		String[] cardList = cards.split(" ");
		
		for (String card : cardList)
			this.cards.add(new Card(card));
		
		Collections.sort(this.cards);
	}

	public String getHandName() {
		return "with high card: " + cards.get(0).getValue();
	}

}
