package com.natixis;

public class Card implements Comparable<Card>{

	String valueName = "";
	int value = 0;
	
	public int getValue() {
		return value;
	}

	public Card(String card) {
		valueName = card.substring(0, 1);
		value = Integer.parseInt(valueName);
	}

	@Override
	public int compareTo(Card other) {
		if (this.value > other.getValue()) return -1;
		if (this.value < other.getValue()) return 1;
		return 0;
	}

}
