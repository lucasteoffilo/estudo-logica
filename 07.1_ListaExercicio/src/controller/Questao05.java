package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {

		/*
		 * Desenvolver um programa que pergunte 5 valores do vetor a, e em seguida crie
		 * um vetor b de mesma dimensão contendo os valores ao quadrado correspondentes
		 * no vetor a. Ao final exibir os 2 vetores.
		 */

		double a[] = new double[5];
		double b[] = new double[5];

		for (int i = 0; i < 5; i++) {
			a[i] = Teclado.lerDouble("Informe um valor.");
			b[i] = Math.pow(a[i], 2);

		}
		for (int i = 0; i < 5; i++) {
			System.out.println("O quadrado de " + a[i] + " = " + b[i]);

		}
	}

}
