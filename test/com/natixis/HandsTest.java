package com.natixis;

import static org.junit.Assert.*;

import org.junit.Test;

public class HandsTest {

	@Test
	public void highCardsWithNumericOnly() {
		assertEquals("with high card: 8", new HandBuilder()
				.withCard("2C")
				.withCard("3H")
				.withCard("4S")
				.withCard("8C")
				.withCard("7H")
				.build().getHandName());
	}

	@Test
	public void highCardsWithHighestNumeric() {
		assertEquals("with high card: 9", new HandBuilder()
				.withCard("2C")
				.withCard("3H")
				.withCard("4S")
				.withCard("8C")
				.withCard("9H")
				.build().getHandName());
	}

	@Test
	public void highCardsWithAce() throws Exception {
		assertEquals("with high card: A", new HandBuilder()
				.withCard("2C")
				.withCard("3H")
				.withCard("4S")
				.withCard("8C")
				.withCard("AH")
				.build().getHandName());
	}
}
