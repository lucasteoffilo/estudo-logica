package controller;

public class Questao05 {

	/*
	 * Desenvolver um programa que apresente todos os números divisíveis por 4 que
	 * sejam menores que 20.
	 */
	public static void main(String[] args) {

		int i = 1;
		do {
			if (i % 4 == 0) {
				System.out.println(i + " é divisivel por 4.");
				i++;
			} else {
				i++;
			}
		} while (i <= 20);
	}

}
