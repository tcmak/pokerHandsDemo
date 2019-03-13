package com.natixis;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card>{

	String valueName = "";
	int value = 0;
	
	Map<String, Integer> valueMap = new HashMap<String, Integer>()
	{
	    {
	        put("T", 10);
	        put("J", 11);
	        put("Q", 12);
	        put("K", 13);
	        put("A", 14);
	    }
	};
	
	public int getValue() {
		return value;
	}

	public String getValueName() {
		return valueName;
	}

	public Card(String card) {
		valueName = card.substring(0, 1);
		value = valueMap.containsKey(valueName) ? valueMap.get(valueName): Integer.parseInt(valueName);
	}

	@Override
	public int compareTo(Card other) {
		if (this.value > other.getValue()) return -1;
		if (this.value < other.getValue()) return 1;
		return 0;
	}

}
