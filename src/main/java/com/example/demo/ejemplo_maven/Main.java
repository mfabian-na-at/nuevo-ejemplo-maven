package com.example.demo.ejemplo_maven;

public class Main {
	public static void main(String[] args) {
		int number = 19;
		System.out.println("Hola [" + number + "] es par?: " + checkIfInputIsAnEvenNumber(number));
	}

	public static boolean checkIfInputIsAnEvenNumber(int number) {
		return number % 2 == 0;
	}
}
