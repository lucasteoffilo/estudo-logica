package controller;

public class Questao14 {

	/*
	 * Desenvolver um programa que calcule o fatorial do número 5, ou seja, 5!.
	 * Desta forma, temos que 5! = 5 . 4 . 3 . 2 . 1 ou 5! = 1 . 2 . 3 . 4 . 5,
	 * equivalente a 120.
	 */
	public static void main(String[] args) {

		int n = 5, f = n - 1, aux = 0;

		while (f > 0) {

			aux = n * f;
			f = f - 1;
			aux = aux * f;
			f = f - 1;
			aux = aux * f;
			f = f - 1;
			aux = aux * f;
			f = f - 1;

			System.out.println("5! = " + aux);

		}

	}

}
