package controller;

public class Questao04 {

	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 5 que
	 * sejam menores que 50.
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 50; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
