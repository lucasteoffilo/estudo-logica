package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte 20 elementos de um vetor a e construa um
		 * vetor b de mesma dimensão com os mesmos elementos de a, os quais devem estar
		 * invertidos, ou seja, o primeiro elemento de a passa a ser o último elemento
		 * de b, e assim por diante. Apresentar os vetores a e b.
		 */

		double a[] = new double[20];
		double b[] = new double[20];

		for (int i = 0; i < 20; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			b[19 - i] = a[i];
		}
		for (int i = 0; i < 20; i++) {
			System.out.println(a[i] + " - " + b[i]);
		}
	}

}
