package controller;

import util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que pergunte os valores de um vetor a com 15
		 * elementos, construa um vetor b de mesmo tipo, sendo que cada elemento do
		 * vetor b deve ser o fatorial do elemento correspondente no vetor a. Apresentar
		 * como resposta todo o conteúdo do vetor b.
		 */

		double a[] = new double[15];
		double b[] = new double[15];
		double aux;

		for (int i = 0; i < 15; i++) {
			a[i] = Teclado.lerDouble("Informe um número.");
			b[i] = a[i];
			aux = b[i] - 1;

			for (; aux > 0; aux = aux - 1) {
				b[i] = b[i] * aux;
			}

		}
		for (int i = 0; i < 15; i++) {
			System.out.println(a[i] + "! = " + b[i]);
		}

	}

}
