package controller;

import util.Teclado;

public class Questao09 {

	public static void main(String[] args) {
		/*
		 * 9) Desenvolver um programa que pergunte o conteúdo de uma matriz a com 3
		 * linhas e 4 colunas. Em seguida preencha a matriz b de mesma dimensão com os
		 * valores da matriz a elevados ao quadrado. Ao final exiba o conteúdo das duas
		 * matrizes.
		 */

		double a[][] = new double[3][4];
		double b[][] = new double[3][4];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = Teclado.lerDouble("Informe um número.");
				b[i][j] = Math.pow(a[i][j], 2);

			}
		}
		System.out.println("Matriz A");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("Matriz B");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
