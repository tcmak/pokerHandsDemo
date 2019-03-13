package com.natixis;

import java.util.ArrayList;

public class HandBuilder {

	ArrayList<String> cards = new ArrayList<>();
	
	public HandBuilder withCard(String card) {
		cards.add(card);
		return this;
	}
	
	public Hand build() {
		return new Hand(String.join(" ", cards));
	}
}
