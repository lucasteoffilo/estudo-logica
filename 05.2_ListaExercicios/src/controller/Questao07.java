package controller;

public class Questao07 {

	/*
	 * Desenvolver um programa que apresente as potências de 2, variando de 0 a 10.
	 */
	public static void main(String[] args) {

		int i = 0;
		do {

			System.out.println("2 elevado a " + i + " = " + Math.pow(2, i));
			i++;

		} while (i <= 10);

	}
}
