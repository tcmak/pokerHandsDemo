package com.natixis;

import static org.junit.Assert.*;

import org.junit.Test;

public class PokerHandsTest {

	@Test
	public void highCardsWithNumericOnly() {
		assertEquals("with high card: 8", new Hand("2C 3H 4S 8C 7H").getHandName());
	}

	@Test
	public void highCardsWithHighestNumeric() {
		assertEquals("with high card: 9", new Hand("2C 3H 4S 8C 9H").getHandName());
	}

}
