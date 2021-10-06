package com.example.demo.ejemplo_maven;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
	
	@Test
	public void primerPrueba() {
		assertTrue(Main.checkIfInputIsAnEvenNumber(13));
	}
}
