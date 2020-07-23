package controller;

import util.Teclado;

public class Questao11 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte ao usuário dois vetores a e b com 15
		 * elementos cada, construa um vetor c com 30 elementos, sendo este a junção dos
		 * outros dois vetores. (primeiro os 15 elementos de a, em seguida os 15
		 * elementos de b). Apresentar ao final o vetor c.
		 */

		double a[] = new double[15];
		double b[] = new double[15];
		double c[] = new double[30];
		int aux = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = Teclado.lerDouble("Informe um número.");
		}
		for (int i = 0; i < a.length; i++) {
			c[aux] = a[i];
			aux++;
		}
		for (int i = 0; i < b.length; i++) {
			c[aux] = b[i];
			aux++;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
