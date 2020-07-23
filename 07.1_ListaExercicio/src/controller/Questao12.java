package controller;

import util.Teclado;

public class Questao12 {

	public static void main(String[] args) {

		/*
		 * Crie dois vetores a e b com 5 elementos cada e preencha-os com números
		 * informados pelo usuário. Ao final apresente os números que existem repetidos
		 * entre os 2 vetores.
		 */

		double a[] = new double[5];
		double b[] = new double[5];

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
		}
		for (int i = 0; i < 5; i++) {
			b[i] = Teclado.lerDouble("Informe um número.");
		}
		for (int i = 0; i < 5; i++) {
			for (int ii = 0; ii < 5; ii++) {

				if (a[i] == b[ii]) {
					System.out.println(a[i] + " = " + b[ii]);

				}
			}
		}
	}

}
