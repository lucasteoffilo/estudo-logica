package controller;

public class Questao14C {

	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
	 * equivalente a 120.
	 */
	public static void main(String[] args) {

		int n = 5, fator = 1;

		while (n >= 1) {

			fator = fator * n;
			n = n - 1;

		}
		System.out.println("5! = " + fator);
	}

}
