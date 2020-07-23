package controller;

import util.Teclado;

public class Questao15 {

	public static void main(String[] args) {

		/*
		 * 15) Desenvolver um programa que leia um vetor a com 15 elementos inteiros.
		 * Construir um vetor b de mesmo tipo, sendo cada um dos elementos do vetor b
		 * ordenados de forma decrescente.
		 */

		int a[] = new int[15];
		int b[] = new int[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = Teclado.lerInt("Informe um número inteiro.");
			b[i] = a[i];
		}
		for (int i = 1; i < a.length; i++) {
			for (int ii = 0; ii < i; ii++) {
				if (b[i] > b[ii]) {
					int aux = b[i];
					b[i] = b[ii];
					b[ii] = aux;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(b[i] + " - " + a[i]);
		}
	}

}
