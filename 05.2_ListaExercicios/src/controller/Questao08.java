package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * Desenvolver um programa que apresente o valor de uma pot�ncia de uma base
	 * qualquer elevada a um expoente qualquer, ou seja, de be. (N�o utilize
	 * Math.pow();)
	 */
	public static void main(String[] args) {

		double b = 1, e, i = 1, aux = b;
		b = Teclado.lerDouble("Informe o valor da base: ");
		e = Teclado.lerDouble("Informe o valor do expoente: ");
		if (e != 0) {

			do {
				aux = aux * b;
				i++;
			} while (i <= e);

			System.out.println(b + " elevado � " + e + " = " + aux);
		} else {
			System.out.println(b + " elevado � zero = 1");
		}
	}

}